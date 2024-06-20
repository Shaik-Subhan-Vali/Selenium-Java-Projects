package Demo_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrm1 {
	
	WebDriver driver;



    @BeforeTest
    public void bfrtst() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	   //	Thread.sleep(3000);
 
     
    }

    @Test(enabled = false)
    public void testcase1() throws InterruptedException {
    	driver.findElement(By.name("username")).sendKeys("Admin"); 
//		driver.findElement(By.name("oxd-input oxd-input--active")).sendKeys("Admin"); 
//		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123"); 
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    }
    @Test(enabled = false)
    public void test2() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	//driver.findElement(By.cssSelector("#checkBoxOption1")).click();
    	
    	WebElement checkbox = driver.findElement(By.cssSelector("#checkBoxOption1"));
    	checkbox.click();
    	
    	if(checkbox.isSelected())
    	{
    		System.out.println("Check box is selected");
    	}
    	else
    	{
    		{
        		System.out.println("Check box is not selected");
        	}
    	}
    }
    
    @Test
    public void test3() throws InterruptedException {
    	
    	Thread.sleep(3000);
    	//driver.findElement(By.cssSelector("#checkBoxOption1")).click();
    	
    	List <WebElement> checkboxes = driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
    	
    	for(WebElement box : checkboxes)
    	{
    		box.click();
    	}   	
    	
    }
     

    @AfterTest
    public void aftrtst() throws InterruptedException {
//    	driver.findElement(By.cssSelector(".oxd-userdropdown-icon")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Logout")).click();
      
    }

  
}
