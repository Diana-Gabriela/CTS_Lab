package ro.ase.csie.cts.g1094.testing.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.g1094.testing.tests.categories.RightValueTest;

@RunWith(Categories.class)
@IncludeCategory ({RightValueTest.class})
@SuiteClasses({ TestProdReq3.class, TestProductReq1.class, TestProductReq2.class })
public class AllRightValueTests {

}
