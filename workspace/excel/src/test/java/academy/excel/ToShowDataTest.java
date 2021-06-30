package academy.excel;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class ToShowDataTest {
@Test
public void ShowData() throws IOException  {
	excelData EDT= new excelData();
	ArrayList Data=EDT.Exceltest("Add Profile");
	//Data.stream().forEach(s->System.out.println(s));
	System.out.println(Data.get(0));
	System.out.println(Data.get(1));
	System.out.println(Data.get(2));
	System.out.println(Data.get(3));
	
}
}
