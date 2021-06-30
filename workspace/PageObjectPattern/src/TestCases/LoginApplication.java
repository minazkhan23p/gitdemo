package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepo.RediffHomepage;
import ObjectRepo.RediffHomepagePF;
import ObjectRepo.RediffLogin;



public class LoginApplication {
@Test
public void Login(){
	System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	RediffLogin rd =new RediffLogin(driver);
	rd.EmaiId().sendKeys("ABC");
	rd.Password().sendKeys("123");
	//rd.login().click();
	rd.Home().click();
	
	RediffHomepagePF rh =new RediffHomepagePF(driver);
	rh.Searchfield().sendKeys("abc");;
	rh.searchbutton().click();
	driver.quit();
}
}
