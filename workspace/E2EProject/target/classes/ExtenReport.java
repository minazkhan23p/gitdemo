package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtenReport {
	static ExtentReports extent;
public static ExtentReports ExtentRepotmethod(){
	String filepath=System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter= new ExtentSparkReporter(filepath);
	reporter.config().setReportName("WebAutomation");
	reporter.config().setDocumentTitle("Automation results");
	 extent = new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Tester", "minaz");
	return extent;
	
}
}
