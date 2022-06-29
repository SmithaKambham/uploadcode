package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencyClass {
	WebDriver driver;
	@Test
	public void openingAmazonSite() throws InterruptedException {
        // for running in Chrome, uncomment 2 following lines
        System.setProperty("webdriver.chrome.driver", "/Users/Smithakambham/Downloads/chromedriver");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.out.println("Open /close  amazon.com in chrome browser");
        driver.get("http://www.amazon.com/");
        Thread.sleep(2000);
        driver.close();
    }
	@Test(dependsOnMethods="openingAmazonSite")
    public void openingYahooSite() throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "/Users/Smithakambham/Downloads/chromedriver");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.out.println("Open /close  yahoo.com in chrome browser");
        driver.get("//.yahoo.com/");
        Thread.sleep(2000);
        driver.close();
    }
	@Test(dependsOnMethods="openingYahooSite")
    public void openingCNNSite() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/Smithakambham/Downloads/chromedriver");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Administrator\\Documents\\drivers\\geckodriver.exe");
//        driver = new FirefoxDriver();
        System.out.println("Open /close  cnn.com in chrome browser");
        driver.get("http://www.cnn.com/");
        Thread.sleep(2000);
        driver.close();
    }




}
