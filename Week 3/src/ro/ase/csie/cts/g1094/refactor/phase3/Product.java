package ro.ase.csie.cts.g1094.refactor.phase3;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1094.refactor.phase3.services.Marketing2021Strategy;
import ro.ase.csie.cts.g1094.refactor.phase3.services.MarketingServiceInterface;
import ro.ase.csie.cts.g1094.refactor.phase3.services.ValidatorServiceInterface;

public class Product {
	
	MarketingServiceInterface mkService= null;
	ValidatorServiceInterface validator= null;
	
	public Product(MarketingServiceInterface mkService,
			ValidatorServiceInterface validator) {
		
	/*	if (mkService==null) {
			throw new NullPointerException();
			
		}  */
		this.setMarketingService(mkService);
		this.validator=validator;

	}
	
	public void setMarketingService(MarketingServiceInterface mkService
			) {
		if (mkService==null) {
		throw new NullPointerException();
		}
		this.mkService=mkService;

	}
	
	public static float getDiscountValue(float price,float discount) {
		return discount*price;
	}
	
	private static float getPriceWithDiscountAndFidelity(float price, float discountValue, float fidelityDiscount) {
		return (price -discountValue )  * (1 - fidelityDiscount);
	}
	
	
	
	private static float getFinalPrice (float price, float fidelityDiscount, ProductType type) {
		float discountValue= getDiscountValue(price, type.getDiscount());
	    float finalPrice = getPriceWithDiscountAndFidelity(price, discountValue, fidelityDiscount);
	    return finalPrice;
	}
	
	public float computePriceWithDiscount(ProductType productType, float price, int accountAge) throws InvalidAgeException, InvalidPriceException
	  {
		if (price<=0) {
			throw new InvalidPriceException();				
		}
		validator.validatePrice(price);
		validator.validateAge(accountAge);
		
		
	    
	    float fidelityDiscount =(productType == ProductType.NEW)? 0 :mkService.getFidelityDiscount(accountAge);
	    
	    float finalPrice = getFinalPrice(price,fidelityDiscount, productType);
	    
	    return finalPrice;
	    
	 
	  
	  }
}