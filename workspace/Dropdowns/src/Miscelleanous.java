import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				//driver.manage().deleteAllCookies();
				//driver.manage().deleteCookieNamed("asdf");
				//to get screenshot
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("D:\\SS\\s.png"));
	}

}
