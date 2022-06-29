package testNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	 WebDriver driver;
	    @Test(dataProvider = "dp")
	    public void checking(String userName, String passWord, String msg) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "/Users/Smithakambham/Downloads/chromedriver");
	        // create object name driver of type ChromeDriver
	        driver = new ChromeDriver();
	        driver.get("https://admin-demo.nopcommerce.com/login");
	        WebElement username = driver.findElement(By.name("Email"));
	        WebElement password = driver.findElement(By.name("Password"));
	        WebElement submitBtn = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	        username.clear();
	        username.sendKeys(userName);
	        password.clear();
	        password.sendKeys(passWord);
	        submitBtn.click();
	        System.out.println("End Result: Form submitted");
	        Thread.sleep(2000);
	    }
	    @DataProvider
	    public Object[][] dp() {
	        return new Object[][] { 
	            new Object[] { "admin", "admin132" ,"Wrong Credentials"}, 
	            new Object[] { "admin", "admnhhj","Wrong Credentials" },
	            new Object[] { "admin@yourstore.com", "admin","Test Passed" },
	        };
	    }
}
