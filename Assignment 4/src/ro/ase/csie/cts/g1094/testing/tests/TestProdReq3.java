package ro.ase.csie.cts.g1094.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1094.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1094.testing.exceptions.WrongPriceException;
import ro.ase.csie.cts.g1094.testing.exceptions.WrongSoldItemsException;
import ro.ase.csie.cts.g1094.testing.models.Product;
import ro.ase.csie.cts.g1094.testing.tests.categories.RightValueTest;

public class TestProdReq3 {
	static Product product;
	static ArrayList<Integer> weeklySoldItems;
	static String initialName;
	static float initialPrice;
	static int initialNumberWeeklySoldItems;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		initialName = "Spaghetti";
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

	
	
	@Category(RightValueTest.class)
	@Test
	public void testGetNoBadWeeksLimitRightValues() throws  WrongSoldItemsException, WrongPriceException, WrongNameException {
		weeklySoldItems = new ArrayList<>();

		product = new Product(initialName, initialPrice, weeklySoldItems );

		product.addWeek(1);
		product.addWeek(1);

		product.addWeek(4);
		product.addWeek(5);
		
		assertEquals("Tesing proper value get weeks above limit", 50 ,product.getPercentOfBadWeeks(4));
		
	}
}
