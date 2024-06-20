package Demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Class {
	
	WebDriver driver;



    @BeforeTest
    public void setuptest() {
        System.out.println("Navigating to login page...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/feed/");
        driver.findElement(By.id("username")).sendKeys("hello");
       // driver.manage().window().maximize();
        
    }

    @Test
    public void testLoginPage() {
        System.out.println("Testing login functionality...");
    }

    @AfterTest
    public void teardownMethod() {
        System.out.println("Logging out...");
        driver.close();
    }

  
}
