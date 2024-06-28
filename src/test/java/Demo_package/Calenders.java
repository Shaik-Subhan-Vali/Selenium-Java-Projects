package Demo_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calenders {
	
	WebDriver driver;

    @BeforeTest
    public void bfrtst() throws InterruptedException {
    	
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().window().maximize();
	    Thread.sleep(1000);
 
     
    }
    @Test
    public void testcase1() throws IOException, InterruptedException {
    	
    	driver.findElement(By.id("datepicker")).click();
    	
    	WebElement clndr = driver.findElement(By.id("ui-datepicker-div"));
    	
    	WebDriverWait exwait = new WebDriverWait(driver, 30);
    	exwait.until(ExpectedConditions.visibilityOf(clndr));
    	
//    	String mnth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
//    	String yr = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
//    
//    	System.out.println(mnth);
//    	
//    	while(!(mnth.equals("May") && yr.equals("2024")))
//    	{
//    		
//    	driver.findElement(By.xpath("//a[@data-handler='next']")).click();
//    	String str1 = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
//    	String str2 = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
//   
//        }
    	
    	String mnth = "";
    	String yr = "";
    	
    	while(!(mnth.equals("May") && yr.equals("2025")))
    	{
    		
    	driver.findElement(By.xpath("//a[@data-handler='next']")).click();
    	mnth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
    	yr = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
   
        }

}


}





