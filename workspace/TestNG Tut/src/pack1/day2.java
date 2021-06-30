package pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day2 {

	@Test (groups={"smoke"})
	public void demo3(){
		System.out.println("min");
	}
	@AfterSuite
	public void aftersuite(){
		System.out.println("aftersuite");
	}
	@BeforeSuite
	public void beforesuite(){
		System.out.println("beforesuite");
	}
}
