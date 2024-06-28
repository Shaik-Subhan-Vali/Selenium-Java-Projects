package Demo_package;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken_Links {

	WebDriver driver;  //decalring it in class level

    @BeforeTest
    public void bfrtst() throws InterruptedException {
    	
    	WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
 
     
    }

    @Test
    public void tc1() throws InterruptedException, IOException {
    	
    	
		driver.findElement(By.name("userName")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("user");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		
		
        List<WebElement> Atags = driver.findElements(By.tagName("a")); 
        
        Atags.size();
        
		for(int i =0; i< Atags.size(); i++)
		{
			String all_links = Atags.get(i).getAttribute("href"); // ur getting all url's in webpage.
			String links_not_working = "https://demo.guru99.com/test/newtours/support.php";
			
			if(all_links.equals(links_not_working))
			{
				System.out.println("links are under construction "+Atags.get(i).getText()); 	
			}
			else
			{
				System.out.println("Links are working "+Atags.get(i).getText());
			}
		}
        	    
    }
    
    @AfterTest
    public void aftrtest() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.quit();
    }
}
