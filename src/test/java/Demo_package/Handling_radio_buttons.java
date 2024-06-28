package Demo_package;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_radio_buttons {
	

	WebDriver driver;

    @BeforeTest
    public void bfrtst() throws InterruptedException {
    	
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
	    Thread.sleep(1000);
 
     
    }
    @Test
    public void testcase1() throws IOException, InterruptedException {
    	
    	List <WebElement > li =   driver.findElements(By.name("radioButton"));
    	
    	for(int i=0 ; i< li.size(); i++)
    	{
    		li.get(i).click();
    		Thread.sleep(1000);
    	}
    	
    	for( WebElement w : li)
    	{
    		w.click();
    		Thread.sleep(1000);
    	}
    	
    }

}









