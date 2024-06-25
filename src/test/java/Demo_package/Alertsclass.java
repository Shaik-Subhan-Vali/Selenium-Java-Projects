package Demo_package;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertsclass {
	
	WebDriver driver ;
	
	@BeforeTest
	public void bfrtest() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	//	driver.get("https://demoqa.com/alerts");
		driver.get("https://www.masaischool.com/events");
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void testcase1() {
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert A = driver.switchTo().alert();
		
		A.accept();
			
	}
	
	@Test
	public void testcase2() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
//		//scroll down step by step
//		js.executeScript("window.scrollBy(0,100) ");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,100) ");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,100) ");
//		Thread.sleep(1000);
//		
//		js.executeScript("window.scrollBy(0,-100) ");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,-100) ");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,-100) ");
//		Thread.sleep(1000);
//		//scroll till last
		
	//	js.executeScript("window.scrollBy(0, document.body.scrollHeight) ");
		
		WebElement element = driver.findElement(By.xpath("//img[@src=\"https://masai-website-images.s3.ap-south-1.amazonaws.com/Aman_Singhal_Website_Desktop_Thumbnail_ad2ba88280.png\"]"));
		
		WebElement ele = driver.findElement(By.xpath("(//a[@class=\"whitespace-nowrap inline-flex items-center justify-center bg-ms-red-500 text-white h-10 uppercase font-semibold text-sm px-4 py-2 rounded-[8px] cursor-pointer\"])[8]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",element);
//		js.executeScript("arguments[0].click()",element);
		js.executeScript("arguments[0].style.backgroundColor = '" + "#000000" + "'", ele);
		js.executeScript("arguments[0].style.border = '10px solid yellow '", ele);

		
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File f = ss.getScreenshotAs(OutputType.FILE);
		String path = "C:/Users/subha/OneDrive/Desktop/selenium screenshots/screenshot.png"; 
		FileUtils.copyFile(f, new File(path));
		Thread.sleep(5000);



		
//		driver.findElement(By.id("timerAlertButton")).click();
//		
//		Thread.sleep(5000);
//		
//		Alert A = driver.switchTo().alert();
//		Thread.sleep(2000);
//		
//		A.accept();
//			
//		driver.close();
	}
	@Test
	public void testcase3() throws InterruptedException {
		
		driver.findElement(By.id("confirmButton")).click();
		
		Thread.sleep(5000);
		
		Alert A = driver.switchTo().alert();
		Thread.sleep(2000);
		
		String S =  A.getText();
		System.out.println(S);
		

//		A.accept();
//		A.dismiss();
//		
//		
//		Thread.sleep(5000);
//		driver.close();
	}


	
	@Test
	public void testcase4() throws InterruptedException {
		
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(5000);
		
		Alert A = driver.switchTo().alert();
		Thread.sleep(2000);
		
		A.sendKeys("Hello all");
		A.accept();
		
		
		Thread.sleep(5000);
		driver.close();
	}
	

}
