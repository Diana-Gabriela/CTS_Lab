package ro.ase.csie.cts.g1094.testing.models;

import java.util.ArrayList;

import ro.ase.csie.cts.g1094.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1094.testing.exceptions.WrongPriceException;
import ro.ase.csie.cts.g1094.testing.exceptions.WrongSoldItemsException;

/*
 * 
 * DISCLAIMER
 * Most of the given methods are implemented with bugs
 * Cele mai multe dintre metodele date au bug-uri 
 * 
 * 
 * SPECS
 * 
 * name - between 5 and 200 alpha-numeric chars (no special chars)
 * price - between [0.01, 100000)
 * soldItems - between [0, 1000]
 * 
 * 
 */

public class Product {
	
	public static final int MIN_NAME_SIZE = 5;
	public static final int MAX_NAME_SIZE = 200;
	public static final float MIN_PRICE = (float) 0.01;
	public static final float MAX_PRICE = 100000;
	public static final int MIN_SOLD_ITEMS = 0;
	public static final int MAX_SOLD_ITEMS = 1000;
	
	
	private String name;
	private float price;
	private ArrayList<Integer> weeklySoldItems;		//number of items sold each week
	
	public Product(String name, float price) throws WrongPriceException, WrongNameException{
		if(name.length() < MIN_NAME_SIZE || name.length() > MAX_NAME_SIZE) {
			throw new WrongNameException();
			}
		else {
			this.name = name;
		}
		if(price < MIN_PRICE || price > MAX_PRICE) {
			throw new WrongPriceException();
			}
		else {
			this.price = price;
		}
		weeklySoldItems = new ArrayList<Integer>();
	}

	public Product(String name, float price, ArrayList<Integer> soldItems) throws WrongPriceException, WrongNameException, WrongSoldItemsException {
		if(name.length() < MIN_NAME_SIZE || name.length() > MAX_NAME_SIZE) {
			throw new WrongNameException();
			}
		else {
			this.name = name;
		}
		if(price < MIN_PRICE || price > MAX_PRICE) {
			throw new WrongPriceException();
			}
		else {
			this.price = price;
		}
		if(soldItems == null) {
			throw new WrongSoldItemsException();
		}
	
		this.weeklySoldItems = new ArrayList<Integer>();
		for(Integer n: soldItems)
			this.weeklySoldItems.add(n);
		
		/*if(this.weeklySoldItems == null) {
			throw new WrongSoldItemsException();}
	*/
	}
	
	public void setSales(ArrayList<Integer> soldItems) throws WrongSoldItemsException {
		if(soldItems == null) {
			throw new WrongSoldItemsException();
		}
		this.weeklySoldItems = (ArrayList<Integer>) soldItems.clone();
	}

	public String getName() {
		return this.name;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void addWeek(int soldItems)throws WrongSoldItemsException{
		if(soldItems < MIN_SOLD_ITEMS || soldItems > MAX_SOLD_ITEMS) {
			throw new WrongSoldItemsException();
			}
		else {
			weeklySoldItems.add(soldItems);}
	}
	
	public int getSoldItems(int i) throws WrongSoldItemsException{
		if(i < MIN_SOLD_ITEMS || i > MAX_SOLD_ITEMS) {
			throw new WrongSoldItemsException();
			}
		else {
		return weeklySoldItems.get(i);}
	}
	
	public int getNoSoldItems() throws WrongSoldItemsException {
		if(weeklySoldItems == null) throw new WrongSoldItemsException();
		return this.weeklySoldItems.size();
	}
	
	/*
	 * 
	 * determines the number of weeks with sales above the given limit
	 * determina numarul de saptamani in care au fost vandute un numar de produse peste limita data
	 * 
	 */
	public int getNoWeeksAboveLimit(int minLimit) throws WrongSoldItemsException{
		int noWeeks = 0;
		if(minLimit < MIN_SOLD_ITEMS || minLimit > MAX_SOLD_ITEMS) {
			throw new WrongSoldItemsException();
			}
		else {
		for(int n: weeklySoldItems)
			if(n >= minLimit)
				noWeeks++;
		return noWeeks;}
	}
	
	/*
	 * 
	 * determines the percentage (%) of weeks with sales under the given limit from total number of weeks
	 * determina procentul saptamanilor (din total saptamani) care au avut vanzari sub limita data
	 * 
	 */
	public int getPercentOfBadWeeks(int minLimit){
		float m = 0;
		for(Integer n: weeklySoldItems)
			if(n < minLimit)
				m += n;
		
		return (int) (100 * m / this.weeklySoldItems.size());
	}
	
	/*
	 * 
	 * 
	 * determines the index of the weeks with maximum sales (multiple weeks can have maximum sales)
	 * determina indexul saptamanilor cu vanzari maxime (mai multe saptamani pot avea vanzari la nivel maxim)
	 * 
	 * 
	 */
	
	public ArrayList<Integer> getWeeksIndexWithMaxSales(){
		ArrayList<Integer> maxWeeks = new ArrayList<>();
		int max = this.weeklySoldItems.get(0);
		
		for(int i = 0; i < this.weeklySoldItems.size(); i++)
			if(this.weeklySoldItems.get(i) > max)
				maxWeeks.add(i);
		
		return maxWeeks;
	}
	
	@Override
	public String toString() {
		String output = this.name + " weekly sales: ";
		for(Integer n: weeklySoldItems)
			output += n + " ";
		return output;
	}	
}