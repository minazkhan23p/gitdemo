package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLogin {
	WebDriver driver;
	public RediffLogin(WebDriver driver){
		this.driver=driver;
	}

	
	By Username=By.xpath("//input[@id='login1']");
	By Paasword=By.xpath("//input[@name='passwd']");
	By sigin=By.xpath("//input[@value='Sign in']");
	By Home=By.xpath("//a[@href='https://www.rediff.com']");
	
	public WebElement EmaiId(){
		return driver.findElement(Username);
		
	}
	public WebElement Password(){
		return driver.findElement(Paasword);
		
	}
	public WebElement login(){
		return driver.findElement(sigin);
		
	}
	
	public WebElement Home(){
		return driver.findElement(Home);
		
	}
}
