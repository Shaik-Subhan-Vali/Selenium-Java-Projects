package Demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Framesclass {
	
	WebDriver driver;



    @BeforeTest
    public void bfrtst() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(3000);
    	driver.manage().window().maximize();    
	
    }
    
    @Test
    public void testcase1() throws InterruptedException {
    	
      WebElement size = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
     
      System.out.println(size.getSize());
      
      driver.switchTo().frame(size);
      
      WebElement drg = driver.findElement(By.id("draggable"));
      WebElement drp = driver.findElement(By.id("droppable"));      
      
      Actions act = new Actions(driver);
      
      act.dragAndDrop(drg, drp).build().perform();
     
    	 
    }
    

}
