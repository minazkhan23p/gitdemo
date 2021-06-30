package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPage {
	
	public WebDriver driver;
	public ForgotPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By email=By.cssSelector("[id='user_email']");
	private By SendInstr=By.cssSelector("[value='Send Me Instruction']");
	private By alert=By.xpath("//div[@role='alert']");

	
	
	public WebElement email(){
		return driver.findElement(email);
	}
	public WebElement SendInstr(){
		return driver.findElement(SendInstr);
	}
	public WebElement alert(){
		return driver.findElement(alert);
	}



}
