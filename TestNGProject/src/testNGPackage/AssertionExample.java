package testNGPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionExample {
	@Test
	  public void checkGoogleSite() {
	      WebDriver driver;
	        // for running in Chrome, uncomment 2 following lines
	        System.setProperty("webdriver.chrome.driver", "/Users/Smithakambham/Downloads/chromedriver");
	        driver = new ChromeDriver();
//	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//	        driver = new FirefoxDriver();
	        driver.get("https://google.com");
	        // storing expected and actual value
	        String expectedTitle = "Google";
	        String actualTitle = driver.getTitle();
	        // asserting the page title to be Google
	        assertEquals(actualTitle, expectedTitle);
	        driver.close();
	        
	  }
}
