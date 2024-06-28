package Demo_package;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Datadriven_Excel {

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
    public void testcase1() throws IOException {
    	
    	File  excel = new File("C:/Users/subha/OneDrive/Desktop/DDusingExcel.xlsx");
    	
    	FileInputStream fis = new FileInputStream(excel);   //to read excel file
    	
    	XSSFWorkbook  wb = new XSSFWorkbook(fis); //to read the particular workbook in an excel file
    	
    	XSSFSheet sht = wb.getSheet("Sheet1"); // to read from the sheet
    	
    	int rowcount=  sht.getLastRowNum();  //fetch the data till the last row of the sheet
    	
    	for(int i = 0;i <= rowcount ;i++)
    	{
    		String c1 = sht.getRow(i).getCell(0).getStringCellValue();   // for going inside column A
    		String c2 = sht.getRow(i).getCell(1).getStringCellValue();    // for going inside column B
    		
    		System.out.println(c1);
    		System.out.println(c2);
    		
    		driver.findElement(By.name("username")).sendKeys(c1);     
    		driver.findElement(By.name("password")).sendKeys(c2);    
    		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
 		
    	}

    }
}












