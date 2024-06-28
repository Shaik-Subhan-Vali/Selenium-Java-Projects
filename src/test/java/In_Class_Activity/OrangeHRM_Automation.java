package In_Class_Activity;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM_Automation {
	
	WebDriver driver;

    @BeforeTest
    public void bfrtst() throws InterruptedException {
    	
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	    Thread.sleep(3000);
 
     
    }

    @Test
    public void tc1() throws InterruptedException, IOException {
    	
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("admin123"); 
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		

		
		
		driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item\"]")).click();
		
		driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("All Might");
		
		WebElement dropdown1 = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]"));
		dropdown1.click();
		driver.findElement(By.xpath("(//span[text()=\"Admin\"])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("No.1 Hero");
		
		WebElement dropdown2 = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[2]"));
		dropdown2.click();
		driver.findElement(By.xpath("//span[text()=\"Enabled\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--ghost\"]")).click();
		
		driver.findElement(By.xpath("(//span[@class=\"oxd-topbar-body-nav-tab-item\"])[2]")).click();
		driver.findElement(By.linkText("Job Categories")).click();
		
		Thread.sleep(2000);
		List<WebElement> anchorTags = driver.findElements(By.tagName("a")); 
	    System.out.println("Number of links in web page are : " + anchorTags.size());
		
	    driver.navigate().back();
	    Thread.sleep(1000);
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    js.executeScript("window.scrollBy(0, document.body.scrollHeight) ");
	    Thread.sleep(1000);
	   
		List<WebElement> l1 = driver.findElements(By.xpath("(//i[@class=\"oxd-icon bi-trash\"])"));
		int lastno = l1.size() - 1; 
		Thread.sleep(3000);
		l1.get(lastno).click();

		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin\"]")).click();
		driver.findElement(By.linkText("My Info")).click();
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.name("firstName"));
		fname.sendKeys(Keys.CONTROL + "a");
		fname.sendKeys(Keys.BACK_SPACE);
		fname.sendKeys("David warner");
		Thread.sleep(2000);
		
		WebElement profileid = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"));
		profileid.sendKeys(Keys.CONTROL + "a");
		profileid.sendKeys(Keys.BACK_SPACE);
		profileid.sendKeys("2024");
		Thread.sleep(2000);
		
		WebElement did = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[3]"));
		did.sendKeys(Keys.CONTROL + "a");
		did.sendKeys(Keys.BACK_SPACE);
		did.sendKeys("7781");
		Thread.sleep(2000);
		
		WebElement otherid = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
		otherid.sendKeys(Keys.CONTROL + "a");
		otherid.sendKeys(Keys.BACK_SPACE);
		otherid.sendKeys("Oh pratik !!");
		Thread.sleep(2000);
		

		
		WebElement clndr = driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-dd-mm\"])[1]"));
		clndr.sendKeys(Keys.CONTROL + "a");
		clndr.sendKeys(Keys.BACK_SPACE);
		clndr.sendKeys("2024-26-06");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[1]")).click();
		driver.findElement(By.xpath("//span[text()=\"Australian\"]")).click();
		
		driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[2]")).click();
		driver.findElement(By.xpath("//span[text()=\"Single\"]")).click();
	
		WebElement dob = driver.findElement(By.xpath("(//input[@placeholder=\"yyyy-dd-mm\"])[2]"));
		dob.sendKeys(Keys.CONTROL + "a");
		dob.sendKeys(Keys.BACK_SPACE);
		dob.sendKeys("1981-07-07");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class=\"oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input\"])[1]")).click();
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
		
		
		driver.findElement(By.xpath("(//div[@class=\"oxd-select-text oxd-select-text--active\"])[3]")).click();
		driver.findElement(By.xpath("//span[text()=\"O+\"]")).click();		
		
     	WebElement Test_Field = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[7]"));
     	Test_Field.sendKeys(Keys.CONTROL + "a");
     	Test_Field.sendKeys(Keys.BACK_SPACE);
     	Test_Field.sendKeys("98765354");
     	
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-100) ");
		js.executeScript("window.scrollBy(0,-100) ");

		
		driver.findElement(By.xpath("//a[@href=\"/web/index.php/pim/contactDetails/empNumber/7\"]")).click();
		Thread.sleep(2000);

		WebElement s1 = driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]"));
		s1.sendKeys(Keys.CONTROL + "a");
		s1.sendKeys(Keys.BACK_SPACE);
		s1.sendKeys("pahse 2");
		Thread.sleep(2000);
		
		WebElement s2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"));
		s2.sendKeys(Keys.CONTROL + "a");
		s2.sendKeys(Keys.BACK_SPACE);
		s2.sendKeys("AR Nagar");
		Thread.sleep(2000);
				
		WebElement s3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input"));
		s3.sendKeys(Keys.CONTROL + "a");
		s3.sendKeys(Keys.BACK_SPACE);
		s3.sendKeys("Andhra");
		Thread.sleep(2000);
		
		WebElement s4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input"));
		s4.sendKeys(Keys.CONTROL + "a");
		s4.sendKeys(Keys.BACK_SPACE);
		s4.sendKeys("A.p");
		Thread.sleep(2000);
		
		WebElement s5 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input"));
		s5.sendKeys(Keys.CONTROL + "a");
		s5.sendKeys(Keys.BACK_SPACE);
		s5.sendKeys("54201");
		Thread.sleep(2000);
		
		WebElement s6 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input"));
		s6.sendKeys(Keys.CONTROL + "a");
		s6.sendKeys(Keys.BACK_SPACE);
		s6.sendKeys("768675798");
		Thread.sleep(2000);
		
		WebElement s7 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input"));
		s7.sendKeys(Keys.CONTROL + "a");
		s7.sendKeys(Keys.BACK_SPACE);
		s7.sendKeys("745646789");
		Thread.sleep(2000);
		
		WebElement s8 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input"));
		s8.sendKeys(Keys.CONTROL + "a");
		s8.sendKeys(Keys.BACK_SPACE);
		s8.sendKeys("7215646789");
		Thread.sleep(2000);
		
		WebElement s9 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input"));
		s9.sendKeys(Keys.CONTROL + "a");
		s9.sendKeys(Keys.BACK_SPACE);
		s9.sendKeys("hello@gmail.com");
		Thread.sleep(2000);
		
		WebElement s10 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input"));
		s10.sendKeys(Keys.CONTROL + "a");
		s10.sendKeys(Keys.BACK_SPACE);
		s10.sendKeys("hello123@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		
		
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		
		List<WebElement> anchorTags1 = driver.findElements(By.tagName("a")); 
		
		for( WebElement lk : anchorTags1 )
		{
			System.out.println(lk.getAttribute("href"));
			
		}
		
		String bfrtit = driver.getTitle();
		
		System.out.println(bfrtit);
		
		driver.findElement(By.name("userName")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("user");
		driver.findElement(By.name("submit")).click();
		
		String afrtit = driver.getTitle();
		
		System.out.println(afrtit);
		
		if(bfrtit.equalsIgnoreCase(afrtit))
		{
			System.out.println("Title not changed ");
		}
		else
		{
			System.out.println("Title changed ");
		}
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.saucedemo.com/")	;
		
		driver.findElement(By.id("user-name")).sendKeys("visual_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
		
		
		js.executeScript("arguments[0].scrollIntoView(true)",cart);
		
		cart.click();
		
		js.executeScript("window.scrollBy(0,-100) ");
		js.executeScript("window.scrollBy(0,-100) ");
		js.executeScript("window.scrollBy(0,-100) ");
		js.executeScript("window.scrollBy(0,-100) ");
		
		driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
		
		driver.navigate().back();
		
		WebElement filter = driver.findElement(By.xpath("//select[@class=\"product_sort_container\"]"));
		
		Select sl = new Select(filter);
		sl.selectByVisibleText("Price (high to low)");
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File f = ss.getScreenshotAs(OutputType.FILE);
		String path = "C:/Users/subha/OneDrive/Desktop/selenium screenshots/screenshot.png"; 
		FileUtils.copyFile(f, new File(path));
		Thread.sleep(5000);

		Set<String> handles = driver.getWindowHandles();


		for (String handle : handles) {
		    System.out.println(handle);		    
		}
		for (String handle : handles) {
		    driver.switchTo().window(handle);
		    break; 
		}



    }

}







