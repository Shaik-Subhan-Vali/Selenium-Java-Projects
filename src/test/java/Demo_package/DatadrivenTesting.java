package Demo_package;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatadrivenTesting {
	
	//data provider is a testng annotation - used to automate the process of providing test cases for execution
	//We can run the same method that can be run multiple times with different data sets
	
	WebDriver driver;

    @BeforeTest
    public void bfrtst() throws InterruptedException {
    	
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
 
     
    }

    @Test(dataProvider = "dp")
    public void tc1(String x, String y) throws InterruptedException, IOException {
    	
		driver.findElement(By.name("username")).sendKeys(x);     
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys(y);    
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
    }
    
    @DataProvider
    public Object[][] dp()
    {
    	
		return new Object[][] 
			{
			
			new Object[] {"Admin",  "admin123" }
			
			};	
    }
}













