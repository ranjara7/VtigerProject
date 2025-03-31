package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener{

	
	JavaUtility jUtil = new JavaUtility();
	String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
	
	ExtentReports report;
	ExtentTest test;
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<>();
	
	
	public void onTestStart(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" On Test Start executed");
		Reporter.log(methodName+" On Test Start executed");
		
		//Adding test method to the extent report
		test = report.createTest(methodName);
		extentTest.set(test); //unique thread id
	}

	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+" On Test Success executed");
		Reporter.log(methodName+" On Test Success Executed");
		
		extentTest.get().log(Status.PASS, methodName+ "test successfully executed");
		//loggin test info
		//test.log(Status.FAIL, methodName+"test success");
		
	}

	public void onTestFailure(ITestResult result) {
		String methodName= result.getMethod().getMethodName();
		System.out.println(methodName+" On Test Failure executed");
		Reporter.log(methodName+" On Test Failure executed");
		
		//loggin test info
        //test.log(Status.FAIL, methodName+"test failed");
		extentTest.get().log(Status.FAIL, methodName+" test failed");
		
		//loggin error message
		test.log(Status.INFO, result.getThrowable());
		
		
//		JavaUtility jUtil = new JavaUtility();
//		String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		
		
		//Taking Screenshot when script fails
		SeleniumUtility sUtil = new SeleniumUtility();
		try {
			String path = sUtil.takeScreenshot(BaseClass.getDriver(), dateTimeStamp);
			
			// test.addScreenCaptureFromPath(path);
			extentTest.get().addScreenCaptureFromPath(path);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		System.out.println(methodName+"on Test skipped executed");
		Reporter.log(methodName+"on Test skipped executed");
		
		//Logging test info
		test.log(Status.SKIP, methodName+"test skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("On start executed");
		
		//Configuration of Extest Reports
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extent Reports\\reports-"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("VTiger Report");
		reporter.config().setReportName("VTiger CRM Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		
		//Create an empty report with the configuration
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base OS",  "Windows");
		report.setSystemInfo("Base URL", "http://localhost:8888");
		report.setSystemInfo("Base browser", "Chrome");
		report.setSystemInfo("Reporter", "Rajeev");
	}

	public void onFinish(ITestContext context) {
		
		//flushing the report
		report.flush();
		
	}
		


}
