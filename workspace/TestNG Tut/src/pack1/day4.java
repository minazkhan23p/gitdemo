package pack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {
@Test

public void webLoginhouseLoan(){
	System.out.println("webLoginhouseLoan");
}
@Test(groups={"smoke"})
public void mobileloginhouseLoan(){
	System.out.println("mobileloginhouseLoan");
}


@Test
public void apiLoginhouseLoan(){
	System.out.println("apiLoginhouseLoan");
}
@BeforeMethod
public void beforemethod(){
	System.out.println("beforemethod");
}

@AfterMethod
public void aftermethod(){
	System.out.println("aftermethod");
}
@BeforeClass
public void beforeClass(){
	System.out.println("beforeClass");
}

@AfterClass
public void afterClass(){
	System.out.println("afterClass");
}

}
