package testNGPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGChronology {
	@Test
	  public void methodName() {
		  System.out.println("This is main test annotation");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("This is main beforeMethod annotation");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("This is main afterMethod annotation");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("This is main beforeClass annotation");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("This is main AfterClass annotation");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("This is main BeforeTest annotation");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("This is main AfterTest annotation");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("This is main BeforeSuite annotation");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("This is main AfterSuite annotation");
	  }
}
