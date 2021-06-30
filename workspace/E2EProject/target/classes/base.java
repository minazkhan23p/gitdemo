package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {
	public WebDriver driver;
	public Properties prop;//so that it can be used in the hole class

	public WebDriver initializeDriver() throws IOException{
		prop= new Properties();
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName=System.getProperty("browser");//to get browser name from maven
		//String browserName=prop.getProperty("browser");
//		if(browserName.contains("chrome")){
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
//			ChromeOptions options=new ChromeOptions();//for headless
//			if(browserName.contains("headless")){//for headless
//				options.addArguments("headless");//for headless
//			 driver = new ChromeDriver(options);//for headless
//		}
//			driver = new ChromeDriver();
//		}
//		else if (browserName.equalsIgnoreCase("firefox")) {
//			//if this is the browser srite same as it is written for chrome 
//		}
//		
//	else if (browserName.equalsIgnoreCase("IE")) {
//		//if this is the browser srite same as it is written for chrome 
//		}
//	else
//	{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
		 driver = new ChromeDriver();
		
//	}
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public String getScreenshot(String Testname, WebDriver driver) throws IOException{
		File sc=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\reports\\"+Testname+".png";
		org.apache.commons.io.FileUtils.copyFile(sc, new File(path));
		return path;
	}
}
