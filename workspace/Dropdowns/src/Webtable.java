import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import okhttp3.internal.connection.StreamAllocation;

public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicit wait
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait w = new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		/*List<WebElement>lst=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> lst1=lst.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> lst2=lst1.stream().sorted().collect(Collectors.toList());
		//Assert.assertEquals(lst1, lst2);
		//or
		Assert.assertTrue(lst1.equals(lst2));*/
		
		//to get the price of rice
		List<String> price;
		do{
			List<WebElement>lst=driver.findElements(By.xpath("//tr/td[1]"));
		
		 price=lst.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
		
		if(price.size()<1){
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);
		
		
	}

	private static String getVeggiePrice(WebElement s) {
		// TODO Auto-generated method stub
		String price=s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
