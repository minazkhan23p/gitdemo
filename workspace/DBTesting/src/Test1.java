import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

public class Test1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\SS1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//url="jdbc:mysql://"+host":"+port+"/databasename";
		//url="jdbc:mysql://"+host":"+port+"/qadbt";
		
		String host="localhost";
		String port="3306";
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/qadbt", "root", "Vecthor23#");
		Statement exec=con.createStatement();
		ResultSet rs=exec.executeQuery("select * from employeeinfo where id=2");
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		while(rs.next()){
		driver.findElement(By.id("user_email")).sendKeys(rs.getString("name"));
		driver.findElement(By.id("user_password")).sendKeys(rs.getString("id"));
		}
	}

}
