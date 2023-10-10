package PageObjectModel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPgeObject {
	
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']");
	
	private By password=By.xpath("//input[@id='password']");
	
	private By login=By.xpath("//input[@id='login']");
	
	
	private By serachforfree=By.xpath("//*[@id=\"signup_link\"]");
	
	public LoginPgeObject(WebDriver driver2) {
		this.driver=driver2;
	}


	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);	
	}
	
	public WebElement clickOnLogin()
	{
		return driver.findElement(login);
	}
	
	public WebElement clickonserarchforfree() {
		
		return driver.findElement(serachforfree);
	}


	
}