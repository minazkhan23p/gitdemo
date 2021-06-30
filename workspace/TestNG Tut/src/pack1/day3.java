package pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
@Parameters({"url"})
@Test
public void webLoginCarLoan(String urlname){
	System.out.println("webLoginCarLoan");
	System.out.println(urlname);
}
@Test
public void mobileloginCarLoan(){
	System.out.println("mobileloginCarLoan");
}


@Test(groups={"smoke","smoke2"})
public void apiLoginCarLoan(){
	System.out.println("apiLoginCarLoan");
}
@BeforeTest
public void before(){
	System.out.println("beforet");
}
}
