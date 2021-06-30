import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions a= new Actions(driver);
		a.dragAndDrop(driver.findElement(By.cssSelector("#draggable")), driver.findElement(By.cssSelector("#droppable"))).build().perform();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.cssSelector(".entry-title")).getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
