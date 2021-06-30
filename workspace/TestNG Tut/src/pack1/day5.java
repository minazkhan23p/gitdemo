package pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day5 {
@Test(timeOut=40000)

public void webLoginCarLoan(){
	System.out.println("webLoginCarLoan");
}
@Test(enabled=false)
public void mobileloginCarLoan(){
	System.out.println("mobileloginCarLoan");
}


@Test(dependsOnMethods={"webLoginCarLoan"})
public void apiLoginCarLoan(){
	System.out.println("apiLoginCarLoan");
}
}
