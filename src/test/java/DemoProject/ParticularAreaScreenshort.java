package DemoProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParticularAreaScreenshort {
	
	@Test
	public void particularareascreenshot() throws InterruptedException, IOException {
		
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://flagfoundationofindia.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		TakesScreenshot srcshort=(TakesScreenshot) driver;
		
		File src= srcshort.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\Desktop\\kartik\\tu.png");
		
		FileUtils.copyFile(src, dest);
		Thread.sleep(2000);
		WebElement newimage= driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div/div/div[1]/div/div[1]/img"));
TakesScreenshot srcshort1=(TakesScreenshot) newimage;
		
		File src1= srcshort1.getScreenshotAs(OutputType.FILE);
		
		File dest1=new File("D:\\Desktop\\kartik\\kp.png");
		
		
		FileUtils.copyFile(src1, dest1);
		Thread.sleep(2000);
		driver.close();
	}

}

///html/body/div[4]/div/div[3]/div/div/div[1]/div/div[1]/img