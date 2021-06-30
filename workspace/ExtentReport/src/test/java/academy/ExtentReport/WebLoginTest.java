package academy.ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class WebLoginTest {
	ExtentReports extent;
	
	@BeforeTest
	public void extentReport(){
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Results");
		reporter.config().setReportName("Web Automation");
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Minaz");
		
		
	}
@Test
public void url(){
	ExtentTest test=extent.createTest("url opening");
	System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	driver.manage().window().maximize();
	//test.addScreenCaptureFromBase64String("screenshot");
	driver.quit();
	//test.fail("simply");
	
	extent.flush();
	
}
}
