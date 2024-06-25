package Demo_package;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsclass {
	
	WebDriver driver;
	
	//In selenium we have two types of actions 1.Keyboard actions 2.Mouse Hover Actions
	
	@BeforeTest(enabled = false)
	public void bfrtest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		driver.manage().window().maximize();
		
	}
	@BeforeTest(enabled = true)
	public void bfrtest1() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		
	}
	
	//comparing the actual and expected results is called as Assertions - 2 types
	//soft assertions and hard assertions
	//hard assertions - is used to check whether a condition is true or not ! - 
	//If actual outcome will not match ur expected outcome then remaining tests will get skipped and the test is marked as failed.
	//But in soft assertions if ur actual outcome do not matches with ur actual outcome the also the remaining tests will get executed.
	
	@Test(enabled = false)
	public void testcase2() {
		
	//	WebElement chbox1 = driver.findElement(By.name("dropdown-class-example"));
		
//        Select  se = new Select(chbox1);
//        
//        se.selectByIndex(1);
//        
//        se.deselectByIndex(1);
//		 
		String exptitle =  driver.getTitle();
		
		Assert.assertEquals("Prace Page", exptitle);
		
		System.out.println("Assertion is passed");
		
		// actual title = "Practice Page" Expected title 
		
		
		
		
		
//		se.selectByIndex(12);
//		Thread.sleep(3000);
//		se.deselectByVisibleText("AUSTRALIA");
		
		
		
	}
	
	@Test(enabled = false)
	public void testcase1() throws InterruptedException {
		
//		System.out.println("I'm in the registration page of guru99 mercury tours");
//		driver.findElement(By.name("firstName")).sendKeys("Izuku");
//		driver.findElement(By.name("lastName")).sendKeys("Midoriya");
//		driver.findElement(By.name("phone")).sendKeys("9876543210");
//		driver.findElement(By.id("userName")).sendKeys("izuku777@gmail.com");
//		
//		//address
//		driver.findElement(By.name("address1")).sendKeys("Phase 2");
//		driver.findElement(By.name("city")).sendKeys("Bglr");
//		driver.findElement(By.name("state")).sendKeys("Karnataka");
//		driver.findElement(By.name("postalCode")).sendKeys("60009");
//		
		
		Thread.sleep(3000);
		
	//	Actions act = new Actions(driver);
		
//		
//		WebElement supportlink =  driver.findElement(By.linkText("SUPPORT"));
//		
//		act.contextClick(supportlink).build().perform();
//		
		
		WebElement drpdwn = driver.findElement(By.name("country"));
		
	//	act.click(drpdwn).build().perform();
		
		//
		
		Select  se = new Select(drpdwn);
		
//		se.selectByIndex(12);
//		Thread.sleep(3000);
//		
//		se.deselectByVisibleText("AUSTRALIA");
//		Thread.sleep(3000);
		
		se.selectByValue("CANADA");
		Thread.sleep(3000);
	//	se.deselectByValue("CANADA");
		
		se.selectByValue("AUSTRALIA");
		
//		act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
//		act.sendKeys(drpdwn,Keys.ARROW_DOWN).build().perform();
//		
//		//  User Information
//		driver.findElement(By.id("email")).sendKeys("youndmidoriya");
//		driver.findElement(By.name("password")).sendKeys("midoriya@777");
//		driver.findElement(By.name("confirmPassword")).sendKeys("midoriya@777");
//		
	
		
	}
	
	@Test
	public void testcase3() {
		
		String exptitle =  driver.getTitle();
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals("Page", exptitle);	
		
		System.out.println("Assertion is passed");
		sa.assertAll();
			
	}

}
