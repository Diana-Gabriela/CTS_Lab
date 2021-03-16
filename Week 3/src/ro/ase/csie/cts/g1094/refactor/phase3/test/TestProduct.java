package ro.ase.csie.cts.g1094.refactor.phase3.test;

import java.util.ArrayList;

import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidAgeException;
import ro.ase.csie.cts.g1094.refactor.exceptions.InvalidPriceException;
import ro.ase.csie.cts.g1094.refactor.phase3.Product;
import ro.ase.csie.cts.g1094.refactor.phase3.ProductType;
import ro.ase.csie.cts.g1094.refactor.phase3.services.Marketing2021Strategy;
import ro.ase.csie.cts.g1094.refactor.phase3.services.MarketingEasternStrategy;
import ro.ase.csie.cts.g1094.refactor.phase3.services.MarketingServiceInterface;
import ro.ase.csie.cts.g1094.refactor.phase3.services.ValidatorServiceInterface;

public class TestProduct {

	public ArrayList<Object> services= new ArrayList<>();
	
	public static void startup() {
		//load s
	//	services.add
		
	}
	
	public static void main(String[] args) {

		
		//Product product = new Product();
		
		Product product= new Product (new Marketing2021Strategy(),
				new ValidatorServiceInterface() {
			
			@Override
			public void validatePrice(float price) throws InvalidPriceException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void validateAge(int accountAge) throws InvalidAgeException {
				// TODO Auto-generated method stub
				
			}
		});
		
		try {
			float finalPrice=
			product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("final price is: " +finalPrice);
			
			product.setMarketingService((new MarketingEasternStrategy()));
			
			product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("final price is: " +finalPrice);
			
			product.setMarketingService(new MarketingServiceInterface() {
				
				@Override
				public float getFidelityDiscount(int accountAge) {
					// TODO Auto-generated method stub
					return 0.3f;
				}
			});
			
			finalPrice=product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
			System.out.println("The final price is "+finalPrice);
			
			
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		}
		
	}

}
