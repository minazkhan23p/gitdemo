package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomepage {
	WebDriver driver;
	public RediffHomepage(WebDriver driver){
		this.driver=driver;
	}

	
	By Searchfield=By.xpath("//input[@id='srchword']");
	By searchbutton=By.xpath("(//input[@type='submit']) [1]");

	
	public WebElement Searchfield(){
		return driver.findElement(Searchfield);
		
	}
	public WebElement searchbutton(){
		return driver.findElement(searchbutton);
		
	}

}
