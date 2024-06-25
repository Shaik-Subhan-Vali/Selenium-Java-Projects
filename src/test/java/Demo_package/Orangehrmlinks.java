package Demo_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrmlinks {
	
	WebDriver driver;



    @BeforeTest
    public void setuptest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
		
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement wb = driver.findElement(By.name("password"));
		  wb.sendKeys("admin123");
		//  wb.getText().clear();
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type=\"submit\"]")));
				 
		//  wb.sendKeys("admin124");
		  
//		  driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//		  Thread.sleep(5000);
//		  driver.navigate().refresh();
//		  driver.navigate().back();
//		  driver.navigate().forward();
//		  wb.sendKeys(Keys.CONTROL + "a"); 
//		  wb.sendKeys(Keys.DELETE);
    }

    @Test
    public void testLoginPage() throws InterruptedException {
     
    	List <WebElement> links = driver.findElements(By.tagName("a"));
    	Thread.sleep(5000);
    	System.out.println(links.size());
    	
    	for (WebElement l : links )
    	{
    		System.out.println(l.getText());
    		System.out.println(l.getAttribute("href"));
    	}
    	
    }

    @AfterTest
    public void teardownMethod() {
        driver.close();
    }


}
