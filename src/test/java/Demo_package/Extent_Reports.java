package Demo_package;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Reports {
	
	WebDriver driver;
	ExtentHtmlReporter htmlreporter ;
	ExtentReports extnt ;
	ExtentTest test  ;

    @BeforeTest
    public void bfrtst() throws InterruptedException {
    	
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//Extent html reporter means we're creating a rich html report.
		htmlreporter = new ExtentHtmlReporter("extent.html");
		//Extent reports will start building the report with the help of extent instance.
		extnt = new ExtentReports();
		//Here i'm creating my reports and i need the reports in html format. so i'm attaching my reports with html reporter.
		extnt.attachReporter(htmlreporter);
		
		
	    Thread.sleep(3000);
 
     
    }

    @Test
    public void tc1() throws InterruptedException, IOException {
    	
    	test = extnt.createTest("This is my first Test");
		driver.findElement(By.name("username")).sendKeys("Admin");
		test.info("I passed the username");
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
    }
    @Test
    public void tc2() throws InterruptedException, IOException {
    	
    	test = extnt.createTest("This is my 2nd Test");
    	driver.findElement(By.name("password")).sendKeys("admin123"); 
    	test.info("I passed the password");
		driver.findElement(By.cssSelector("butto[type=\"submit\"]")).click();
		test.info("I clicked on submit");
		driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item\"]")).click();
		test.info("I navigating to admin page");
		
		extnt.flush();
    	
    }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    