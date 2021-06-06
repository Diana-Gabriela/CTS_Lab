package ro.ase.csie.cts.g1094.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1094.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1094.testing.exceptions.WrongPriceException;
import ro.ase.csie.cts.g1094.testing.exceptions.WrongSoldItemsException;
import ro.ase.csie.cts.g1094.testing.models.Product;
import ro.ase.csie.cts.g1094.testing.tests.categories.RightValueTest;


public class TestProductReq1 {

	static Product product;
	static ArrayList<Integer> weeklySoldItems;
	static String initialName;
	static float initialPrice;
	static int initialNumberWeeklySoldItems;


	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		initialName = "Pizza";
		initialPrice = Product.MIN_PRICE+1;
		
		initialNumberWeeklySoldItems = 3;
		weeklySoldItems = new ArrayList<>();
		
		Random random = new Random();
		
		for(int i = 0; i< initialNumberWeeklySoldItems; i++) {
			weeklySoldItems.add(random.nextInt(Product.MAX_SOLD_ITEMS) + 1);
			}
		
		}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		product = new Product(initialName, initialPrice, weeklySoldItems );
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//1 Right test for each constructor
	@Category(RightValueTest.class)
	@Test
	public void testConstructorNameRightValues() throws WrongNameException, WrongPriceException {
		
		
		String newName = "Hamburger";
		product = new Product(newName, initialPrice);
		assertEquals("Testing with proper name", newName, product.getName());
		
	}
	@Category(RightValueTest.class)
	@Test
	public void testConstructorPriceRightValues() throws WrongPriceException, WrongNameException, WrongSoldItemsException {
		
		float newPrice = 200;
		product = new Product(initialName, newPrice, weeklySoldItems);
		
		assertEquals("Testing with proper price", newPrice, product.getPrice(),0);

	}
	// 2 Error Condition tests for each constructor
	
	@Test(expected = WrongPriceException.class)
	public void testConstructorWrongPriceErrorCondition() throws WrongPriceException, WrongNameException{
		float wrongPrice  = Product.MIN_PRICE - 1;
		product = new Product(initialName, wrongPrice);
		
	}
	
	@Test(expected = WrongNameException.class)
	public void testConstructorWrongNameErrorCondition() throws WrongPriceException, WrongNameException{
		String wrongName = "";
		product = new Product(wrongName, initialPrice);
		
	}
	
	@Test(expected = WrongPriceException.class)
	public void testSecondConstructorWrongPriceErrorCondition() throws WrongPriceException, WrongNameException, WrongSoldItemsException{
		float wrongPrice  = Product.MAX_PRICE + 1;
		product = new Product(initialName, wrongPrice, weeklySoldItems);
		
	}
	
	@Test(expected = WrongNameException.class)
	public void testSecondConstructorWrongNameErrorCondition() throws WrongPriceException, WrongNameException, WrongSoldItemsException{
		String wrongName = "Pear";
		product = new Product(wrongName, initialPrice, weeklySoldItems);
		
	}


	//1 Existence test  for the constructor that receives the ArrayList

	@Test(expected = WrongSoldItemsException.class)
	public void testArrayConstructorExistenceNull() throws WrongPriceException, WrongNameException, WrongSoldItemsException{
		
		ArrayList<Integer> weeklySoldItemsNull = null;
	
		product = new Product(initialName, initialPrice, weeklySoldItemsNull);
	}
	
	//1 Reference test for the setSales()
		@Test
		public void testSetSalesReferenceDeepCopy() throws WrongSoldItemsException {
			int[] soldItems = new int[] {9,9,10};
			
			//ArrayList<Integer> refGrades = new ArrayList<Integer>(Arrays.asList(9, 9, 10));

			ArrayList<Integer> refSoldItems = new ArrayList<>();
			for(int item: soldItems) {
				refSoldItems.add(item);
			}
			
			product.setSales(refSoldItems);
			
			refSoldItems.set(0, 5);
			
			int[] productSoldItems = new int [product.getNoSoldItems()];
			for(int i = 0; i<product.getNoSoldItems(); i++) {
				productSoldItems[i] = product.getSoldItems(i);
			}
			
			assertArrayEquals("we do shallow copy", soldItems, productSoldItems);
		}
		
	//1 Existence test for setSales()

		@Test(expected = WrongSoldItemsException.class)
		public void testSetSalesExistenceNull() throws  WrongSoldItemsException{
			
			ArrayList<Integer> weeklySoldItemsNull = null;
			product.setSales(weeklySoldItemsNull);
		
		}

}
