package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.ForgotPage;
import PageObjects.LoginPage;
import PageObjects.landingPage;
import resources.base;



public class HomePage extends base {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(HomePage.class.getName());
@BeforeMethod
public void Hiturl() throws IOException{
	driver=initializeDriver();
	driver.get(prop.getProperty("url"));
}
@Test(dataProvider="getdata")
public void basePageNavigation(String username,String password, String message) throws IOException{

	landingPage lp=new landingPage(driver);
	LoginPage lgp=lp.login();
	lgp.email().sendKeys(username);
	lgp.passowrd().sendKeys(password);
	lgp.submit().click();
	log.info(message);
	ForgotPage fp=lgp.FrgttPage();
	fp.email().sendKeys("abc");
	fp.SendInstr().click();
	
}

@DataProvider
public Object[][] getdata(){
	Object [][] data= new Object [2][3];
	data[0][0]="abc";
	data[0][1]="abc123";
	data[0][2]="user";
	
	
	data[1][0]="abcdef";
	data[1][1]="vesv2211";
	data[1][2]="not a user";
	return data ;
	
}
@AfterTest
public void closeTest(){
	driver.quit();
}
}
