package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	
	public static WebDriver driver;
	 public  void driverIntialize() throws IOException {
	FileInputStream fs= new FileInputStream("D:\\Desktop\\automation testing\\25thBatchFinalProject\\src\\main\\java\\resources\\data.properties");
	
	Properties prop = new Properties() ;
    
	prop.load(fs);
	
 String browserNAme=prop.getProperty("browser"); 
 
	if(browserNAme.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	
	else if(browserNAme.equalsIgnoreCase("edge"))
	{
	   driver=new EdgeDriver();
	}
	
	else if(browserNAme.equalsIgnoreCase("firefox"))
	{
	   driver=new FirefoxDriver();
	}
	
	else
	{
		System.out.println("plz check you have mentioned correct browser");
	}
	
	}
	 
	// @AfterMethod
	 
//	 public void closeBrowser() {
//		 
//		 
//		 driver.quit();
//	 }


	
}

