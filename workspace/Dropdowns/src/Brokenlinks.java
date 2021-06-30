import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		SoftAssert S=new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//String url=driver.findElement(By.xpath("//a[contains(@href,'brokenlink')]")).getAttribute("href");
		Thread.sleep(2000);
		List<WebElement>links=driver.findElements(By.cssSelector("[class='gf-t'] a"));
		for(WebElement link:links){
			String url=link.getAttribute("href");
		
		HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int status=conn.getResponseCode();
		System.out.println(status);
		S.assertTrue(status<400, link.getText()+" is broken");
		/*if(status>400){
			System.out.println(link.getText()+" is broken");
			Assert.assertTrue(false);
		}*/
		}
		S.assertAll();
		
	}

}
