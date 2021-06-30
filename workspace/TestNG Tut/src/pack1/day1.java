package pack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@Test(groups={"smoke","smoke2"})
	public void demo() {
		System.out.println("abc");
	}
	@Parameters({"password"})
	@Test
	public void demo2(int password) {
		System.out.println(password);
	}

}

