package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.landingPage;
import resources.base;

public class titleValidation extends base {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(titleValidation.class.getName());
	landingPage lp;
	@BeforeMethod
	public void Hiturl() throws IOException{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));
	}
@Test
public void basePageNavigation() throws IOException{
	 lp=new landingPage(driver);
	String title =lp.title().getText();
	Assert.assertEquals(title, "FEATURED COURSES");
	log.info("title validated");

}
@Test
public void headerValidation() throws IOException{
	String header =lp.header().getText();
	Assert.assertEquals(header, "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
	log.info("header validated");

}

@AfterTest
public void closeTest(){
	driver.quit();
}


}
