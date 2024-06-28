package Demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_dropdowns {
	
	ExtentHtmlReporter htmlreporter ;
	ExtentReports extnt ;
	ExtentTest test  ;
	
	
	@BeforeTest
	public void setup() {
		
		htmlreporter = new ExtentHtmlReporter("extent.html");
		//Extent reports will start building the report with the help of extent instance.
		extnt = new ExtentReports();
		//Here i'm creating my reports and i need the reports in html format. so i'm attaching my reports with html reporter.
		extnt.attachReporter(htmlreporter);
	}
	
	
	@Test
	public void test1() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver dr2 = new FirefoxDriver();
		
		dr2.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		test = extnt.createTest("MY 1st test");
		
		
		dr2.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("Indi");
		
		test.info("clicking on input box");
		Thread.sleep(2000);
		dr2.findElement(By.xpath("//div[@class=\"ui-menu-tem-wrapper\" and .='India']")).click();
		
		extnt.flush();
		}
	

}
