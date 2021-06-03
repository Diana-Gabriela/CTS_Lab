package ro.ase.csie.cts.g1094.testing.tests;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.g1094.testing.tests.categories.ImportantTest;
import ro.ase.csie.cts.g1094.testing.tests.categories.PerformanceTests;

@RunWith(Categories.class)
@IncludeCategory({ImportantTest.class,PerformanceTests.class})

@SuiteClasses({ TestStudent.class, TestStudentNewTests.class })
public class AllImportantTests {

}
