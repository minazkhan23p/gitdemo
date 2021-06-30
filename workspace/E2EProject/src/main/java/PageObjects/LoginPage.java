package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By email=By.cssSelector("[id='user_email']");
	private By passowrd=By.cssSelector("[id='user_password']");
	private By submit=By.cssSelector("[type='submit']");
	private By ForgotPass=By.xpath("//a[text()='Forgot Password?']");
	
	
	public WebElement email(){
		return driver.findElement(email);
	}
	public WebElement passowrd(){
		return driver.findElement(passowrd);
	}

	public WebElement submit(){
		return driver.findElement(submit);
	}
	public ForgotPage FrgttPage(){
		 driver.findElement(ForgotPass).click();
		 return new ForgotPage(driver);
		 
	}
	


}
