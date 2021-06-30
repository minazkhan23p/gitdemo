package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LoginPage;
import PageObjects.landingPage;
import resources.base;

public class ValidateNavigationBar extends base {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(ValidateNavigationBar.class.getName());
	@BeforeMethod
	public void Hiturl() throws IOException{
		
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
@Test
public void basePageNavigation() throws IOException{
	

	driver=initializeDriver();
	driver.get(prop.getProperty("url"));
	landingPage lp=new landingPage(driver);
	Assert.assertTrue(lp.contactTab().isDisplayed());
	log.info("ValidateNavigationBar");
}
@AfterTest
public void closeTest(){
	driver.quit();
}

}
