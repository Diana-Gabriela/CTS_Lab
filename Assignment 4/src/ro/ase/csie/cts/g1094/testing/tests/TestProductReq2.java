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

public class TestProductReq2 {

	static Product product;
	static ArrayList<Integer> weeklySoldItems;
	static String initialName;
	static float initialPrice;
	static int initialNumberWeeklySoldItems;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		initialName = "Sushi";
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

	//1 Right for each method;
		
		@Category(RightValueTest.class)
		@Test
		public void testAddWeekRightValues() throws  WrongSoldItemsException {
			
			int newNumberItemsSold = Product.MIN_SOLD_ITEMS+1;
			product.addWeek(newNumberItemsSold);
			assertEquals("Testing upper limit", newNumberItemsSold, product.getSoldItems(0));

		}
		@Category(RightValueTest.class)
		@Test
		public void testGetSoldItemsRightValues() throws  WrongSoldItemsException, WrongPriceException, WrongNameException {
			
			int newNumberItemsSold = 2;
			int i = 1;
			
			weeklySoldItems = new ArrayList<>();
			weeklySoldItems.add(1);
				
			product = new Product(initialName, initialPrice, weeklySoldItems );

			product.addWeek(newNumberItemsSold);
			product.getSoldItems(i);
			assertEquals("Tesing proper value get sold items", newNumberItemsSold, product.getSoldItems(i));
		}
		@Category(RightValueTest.class)
		@Test
		public void testGetNoWeeksAboveLimitRightValues() throws  WrongSoldItemsException, WrongPriceException, WrongNameException {
			weeklySoldItems = new ArrayList<>();
			weeklySoldItems.add(1);


			product = new Product(initialName, initialPrice, weeklySoldItems );

			product.addWeek(1);
			product.addWeek(4);
			product.addWeek(5);
			
			assertEquals("Tesing proper value get weeks above limit", 2 ,product.getNoWeeksAboveLimit(4));
			
		}
		//1 Range test to verify a condition for which the function being tested generates an exception (for each method);

		@Test(expected = WrongSoldItemsException.class)
		public void testAddWeekRangeError() throws WrongSoldItemsException{
			int newNumberItemsSold = Product.MIN_SOLD_ITEMS-1;
			product.addWeek(newNumberItemsSold);
			
			
		}
		@Test(expected = WrongSoldItemsException.class)
		public void testGetSoldItemsRangeError() throws  WrongSoldItemsException, WrongPriceException, WrongNameException {
			
			int newNumberItemsSold = -1;
			int i = 1;

			product.addWeek(newNumberItemsSold);
			product.getSoldItems(i);
		}
		@Test(expected = WrongSoldItemsException.class)
		public void testGetNoWeeksAboveLimitRangeError() throws  WrongSoldItemsException, WrongPriceException, WrongNameException {

			product.addWeek(-1);
			product.addWeek(Product.MIN_SOLD_ITEMS+1);
			
			product.getNoWeeksAboveLimit(Product.MIN_SOLD_ITEMS);
			
		}
		
		//2 tests to check extreme limits (Boundary) for each method;
		@Test
		public void testAddWeekBoundaryLower() throws  WrongSoldItemsException {
			
			int newNumberItemsSold = Product.MIN_SOLD_ITEMS;
			product.addWeek(newNumberItemsSold);
			assertEquals("Testing upper limit", newNumberItemsSold, product.getSoldItems(0));

			}
		@Test
		public void testAddWeekBoundaryUpper() throws  WrongSoldItemsException {
			
			int newNumberItemsSold = Product.MAX_SOLD_ITEMS;
			product.addWeek(newNumberItemsSold);
			assertEquals("Testing upper limit", newNumberItemsSold, product.getSoldItems(0));
			}
		@Test
		public void testGetSoldItemsBoundaryLower() throws  WrongSoldItemsException, WrongPriceException, WrongNameException {
			
			int newNumberItemsSold = Product.MIN_SOLD_ITEMS;
			
			weeklySoldItems = new ArrayList<>();
				
			product = new Product(initialName, initialPrice, weeklySoldItems );

			product.addWeek(newNumberItemsSold);
			product.getSoldItems(0);
			assertEquals("Tesing lower limit", newNumberItemsSold, product.getSoldItems(0));
		}
		
		@Test
		public void testGetSoldItemsBoundaryUpper() throws  WrongSoldItemsException, WrongPriceException, WrongNameException {
			
			int newNumberItemsSold = Product.MAX_SOLD_ITEMS;
			
			weeklySoldItems = new ArrayList<>();
				
			product = new Product(initialName, initialPrice, weeklySoldItems );

			product.addWeek(newNumberItemsSold);
			product.getSoldItems(0);
			assertEquals("Tesing lower limit", newNumberItemsSold, product.getSoldItems(0));
		}


		@Test
		public void testGetNoWeeksAboveLimitLowerBoundary() throws  WrongSoldItemsException, WrongPriceException, WrongNameException {
			weeklySoldItems = new ArrayList<>();

			product = new Product(initialName, initialPrice, weeklySoldItems );

			product.addWeek(product.MIN_SOLD_ITEMS);
			
			assertEquals("Tesing lower boundary value get weeks above limit", 1 ,product.getNoWeeksAboveLimit(product.MIN_SOLD_ITEMS));
			
		}
		
		@Test
		public void testGetNoWeeksAboveLimitUpperBoundary() throws  WrongSoldItemsException, WrongPriceException, WrongNameException {
			weeklySoldItems = new ArrayList<>();

			product = new Product(initialName, initialPrice, weeklySoldItems );

			product.addWeek(product.MAX_SOLD_ITEMS);
			
			assertEquals("Tesing lower boundary value get weeks above limit", 1 ,product.getNoWeeksAboveLimit(product.MAX_SOLD_ITEMS));
			
		}
		
		//2 Cardinality tests for getNoWeeksAboveLimit();
		@Test
		public void testGetMinGradeCardinalityZero() throws WrongSoldItemsException, WrongPriceException, WrongNameException {
			weeklySoldItems = new ArrayList<>();
			weeklySoldItems.add(1);

			product = new Product(initialName, initialPrice, weeklySoldItems );
			product.addWeek(Product.MIN_SOLD_ITEMS+1);

			int expectedNoWeeks =0;
			int minWeeks = product.getNoWeeksAboveLimit(Product.MAX_SOLD_ITEMS-1);		
			assertEquals("Testing with 0 weeks", expectedNoWeeks, minWeeks);
			
		}
		
		@Test
		public void testGetMinGradeCardinalityOne() throws WrongSoldItemsException, WrongPriceException, WrongNameException {
			weeklySoldItems = new ArrayList<>();

			int singleWeek = Product.MIN_SOLD_ITEMS+2;
			product = new Product(initialName, initialPrice, weeklySoldItems );
			product.addWeek(singleWeek);

			int expectedNoWeeks =1;
			int minWeeks = product.getNoWeeksAboveLimit(Product.MIN_SOLD_ITEMS+1);		
			assertEquals("Testing with 1 week", expectedNoWeeks, minWeeks);
			
		}
		//only for getNoWeeksAboveLimit() a Performance/Time test that will verify that the function return a result under 3 seconds for an array with 1000 weeks

		@Test
		public void testGetGradesAveragePerformance() throws WrongSoldItemsException{
			ArrayList<Integer> weeklySoldItems = new ArrayList<>();
			int noWeekes = (int) 1000;
			Random random = new Random();
			for(int i = 0;i<noWeekes;i++) {
				weeklySoldItems.add(random.nextInt(Product.MAX_SOLD_ITEMS)+1);
			}
			//product.getNoWeeksAboveLimit(Product.MIN_SOLD_ITEMS+10);
			
			long tStart = System.currentTimeMillis();
			product.getNoWeeksAboveLimit(Product.MIN_SOLD_ITEMS+10);
			long tFInal = System.currentTimeMillis();
			
			long delta = tFInal - tStart;
			long performaceLimit = 3;
			if(delta <= performaceLimit) {
				assertTrue(true);
			}
			else {
				fail("Takes too long");
			}
			
		}

	
		//2 tests of your choice to verify other criteria (other than the above) for any method.
		//Existence test for getNoSoldItems()

		@Test(expected = WrongSoldItemsException.class)
		public void testGetNoSoldItemsExistenceNull() throws  WrongSoldItemsException, WrongPriceException, WrongNameException{
			
			ArrayList<Integer> weeklySoldItemsNull = null;
			product = new Product(initialName, initialPrice, weeklySoldItemsNull );
			product.getNoSoldItems();
		
		}
		//Inverse test for setSales()
		@Test
		public void testSetSalesInverse() throws WrongSoldItemsException, WrongPriceException, WrongNameException {
			ArrayList<Integer> weeklySoldItemsNew = new ArrayList<>();
			weeklySoldItemsNew.add(1);

			product = new Product(initialName, initialPrice, weeklySoldItems );

			product.setSales(weeklySoldItemsNew);
			assertNotEquals("setSales not changing array", weeklySoldItems,product.getNoSoldItems());
		}
		

}
