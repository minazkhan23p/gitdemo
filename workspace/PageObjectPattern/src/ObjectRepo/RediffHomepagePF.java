package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepagePF {
	WebDriver driver;
	public RediffHomepagePF(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	//By Searchfield=By.xpath("//input[@id='srchword']");
	//By searchbutton=By.xpath("(//input[@type='submit']) [1]");
	@FindBy(xpath="//input[@id='srchword']")
	WebElement Searchfield;
	
	@FindBy(xpath="(//input[@type='submit']) [1]")
	WebElement searchbutton;

	
	public WebElement Searchfield(){
		return Searchfield;
		
	}
	public WebElement searchbutton(){
		return searchbutton;
		
	}

}
