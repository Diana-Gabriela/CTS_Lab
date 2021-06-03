package ro.ase.csie.cts.g1094.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.g1094.testing.exceptions.WrongNameException;
import ro.ase.csie.cts.g1094.testing.models.Product;


public class TestProductReq1 {

	static Product product;
	static ArrayList<Integer> weeklySoldItems;
	static String initialName;
	static float initialPrice;

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		weeklySoldItems = new ArrayList<>();
		weeklySoldItems.add(9);
		weeklySoldItems.add(10);
		initialName = "Pizza";
		initialPrice = 21;

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
	
	@Test
	public void testSetNameRightValues() throws WrongNameException {
		
		assertEquals("Testing with proper name", initialName, product.getName());
		
	}

}
