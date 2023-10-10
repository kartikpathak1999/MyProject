package DemoProject;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.values.XmlFloatImpl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingExcel2 {
	
	
	@Test
	public void excelHandle2() throws IOException, InterruptedException {
		
		
   FileInputStream f= new FileInputStream("D:\\\\Desktop\\\\Data.xlsx");
		
	  XSSFWorkbook workbook = new XSSFWorkbook(f);
	  
	  XSSFSheet sheet = workbook.getSheetAt(0);
	  
	  XSSFRow row =sheet.getRow(0);
	  
	  XSSFCell cell = row.getCell(0);
	 
	  
	  XSSFCell cell1 = row.getCell(1);
	  
	  
	  
	  
	  WebDriver driver= new ChromeDriver();
		
	  driver.get("https://login.salesforce.com/?locale=in");
	  
	  
	  driver.manage().window().maximize();
	  
	  
	  
	//  Thread.sleep(7000);
	  WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	  
	 
	  Thread.sleep(2000);
	  
	  username.sendKeys(cell.getStringCellValue());
	  
	  
	  //  Thread.sleep(3000);
  WebElement password = driver.findElement(By.xpath(" //*[@id=\"password\"] "));
	  
  
  
  Thread.sleep(3000);
	  password.sendKeys(cell1.getStringCellValue());
	  
	  
	  
	  Thread.sleep(1000);
	  
	  WebElement Login = driver.findElement(By.xpath("//*[@id=\"Login\"]"));
			  
			  
	  Login.click();
	  
	  
	  
	 Thread.sleep(1000);
	 
	 driver.close();
	 
	 
	 
	  
	  
	  
	  
	  
	  
	 
	  
	  
	
		
	}
	
	

}
