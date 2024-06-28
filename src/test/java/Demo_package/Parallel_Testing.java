package Demo_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Testing {
	
	
	@Test
	public void test1() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		  Thread.sleep(3000);
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  WebElement wb = driver.findElement(By.name("password"));
		  wb.sendKeys("admin123");
		  WebDriverWait wait = new WebDriverWait(driver,30);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type=\"submit\"]")));		
	}
	
	@Test
	public void test2() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver dr2 = new FirefoxDriver();
		
		dr2.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		
	}
	

}
