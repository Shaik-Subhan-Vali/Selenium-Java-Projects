package Demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrmxpaths {
	
	WebDriver driver;



    @BeforeTest
    public void bfrtst() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
    	driver.manage().window().maximize();    
	
    }
    
    @Test
    public void testcase1() throws InterruptedException {
    	
    	 driver.findElement(By.name("username")).sendKeys("Admin");
         driver.findElement(By.name("password")).sendKeys("admin123");
         driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
         Thread.sleep(5000);
         driver.findElement(By.linkText("Admin")).click();
         Thread.sleep(3000);
    	 driver.findElements(By.xpath("//i[@class=\"oxd-icon bi-trash\"]")).get(1).click();
    	 
    	 
    	 Thread.sleep(5000);
    	 driver.close();
    }
    
}
