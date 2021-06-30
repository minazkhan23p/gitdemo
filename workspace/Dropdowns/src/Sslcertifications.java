import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sslcertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities ds= new DesiredCapabilities();
		//ds.acceptInsecureCerts();
		//or we can use:
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ds.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions ch = new ChromeOptions();
		ch.merge(ds);
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}

}
