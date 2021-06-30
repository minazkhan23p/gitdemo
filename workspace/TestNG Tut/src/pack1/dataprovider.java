package pack1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
@Test(dataProvider="data")
public void webLoginCarLoan(String username, String Password){
	System.out.println(username+"    "+Password);
	
}

@Test
public void failtest(){
	Assert.assertTrue(false);
}


@DataProvider
public Object [][]  data(){
	Object [][] data=new Object[3][2];
	data[0][0]="obj1";
	data[0][1]="password1";
	data[1][0]="obj2";
	data[1][1]="password2";
	data[2][0]="obj3";
	data[2][1]="password3";
	return data;
	
}
}
