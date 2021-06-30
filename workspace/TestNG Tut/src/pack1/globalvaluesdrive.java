package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class globalvaluesdrive {

	@Test
	public static void globalvalues() throws IOException {
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("E:\\workspace\\TestNG Tut\\src\\pack1\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos=new FileOutputStream("E:\\workspace\\TestNG Tut\\src\\pack1\\data.properties");
		prop.store(fos, null);
		
		// TODO Auto-generated method stub

	}

}
