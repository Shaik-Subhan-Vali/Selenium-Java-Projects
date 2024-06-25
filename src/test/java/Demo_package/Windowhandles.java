package Demo_package;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandles {
	WebDriver driver;



    @BeforeTest
    public void bfrtst() throws InterruptedException {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        Thread.sleep(3000);
    	driver.manage().window().maximize();    
	
    }
    
    @Test
    public void testcase1() throws InterruptedException {
    Set <String> wdwhndls =	driver.getWindowHandles();
    Iterator<String> it = wdwhndls.iterator();
    
    String parentid = it.next();
    System.out.println(parentid);
    
    String childid = it.next();
    System.out.println(childid);
    
    //clicking on particular element on child tab
    driver.findElement(By.linkText("Job Support")).click();
    
    //swithcing to window parent tab
    driver.switchTo().window(parentid);
    
    	
 //   driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
}
    
    @AfterTest
    public void afrtest() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.quit();
    }
}
