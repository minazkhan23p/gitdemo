package Academy.E2EProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtenReport;
import resources.base;

public class listeners extends base implements ITestListener {
	ExtentReports extent=ExtenReport.ExtentRepotmethod();
	ExtentTest test;
	ThreadLocal<ExtentTest> Threadtest = new ThreadLocal<ExtentTest>();
	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onFinish(org.testng.ITestContext)
	 */
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}
	

	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onStart(org.testng.ITestContext)
	 */
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		/*test=extent.createTest(result.getMethod().getMethodName());
		Threadtest.set(test);*/
		
	}

	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onTestFailedButWithinSuccessPercentage(org.testng.ITestResult)
	 */
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onTestFailedWithTimeout(org.testng.ITestResult)
	 */
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onTestFailure(org.testng.ITestResult)
	 */
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//Threadtest.get()
		Threadtest.get().fail(result.getThrowable());
		WebDriver driver=null;
		String MethodName=result.getMethod().getMethodName();
		try {
			driver=(WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Threadtest.get().addScreenCaptureFromPath(getScreenshot(MethodName,driver), result.getMethod().getMethodName());
			//upper driver i am passing it dwon
			//getScreenshot(MethodName,driver);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}

	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onTestSkipped(org.testng.ITestResult)
	 */
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onTestStart(org.testng.ITestResult)
	 */
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test=extent.createTest(result.getMethod().getMethodName());
		Threadtest.set(test);
	}

	/* (non-Javadoc)
	 * @see org.testng.ITestListener#onTestSuccess(org.testng.ITestResult)
	 */
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//Threadtest.get().
		Threadtest.get().log(Status.PASS, "Test Passed");
		
	}

}
