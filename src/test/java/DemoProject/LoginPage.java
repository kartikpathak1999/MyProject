package DemoProject;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPgeObject;
import resources.BaseClass;


public class LoginPage extends BaseClass {
	
	
	@Test
	public void verifyLoginDemo() throws IOException, InterruptedException {
		
		
		driverIntialize();
		
		driver.get("https://login.salesforce.com/");
	
		
		
Thread.sleep(2000);
		
		LoginPgeObject obj=new LoginPgeObject(driver);
		
		obj.enterUsername().sendKeys("vaibhavjarile@gmail.com");
		
		Thread.sleep(1000);
		
		obj.enterPassword().sendKeys("vaibhav@123");
		
		Thread.sleep(1000);
		
	//	obj.clickOnLogin().click();
		
		Thread.sleep(2000);
		
		obj.clickonserarchforfree().click();
		
		
	
		
	}


		
		
	}


