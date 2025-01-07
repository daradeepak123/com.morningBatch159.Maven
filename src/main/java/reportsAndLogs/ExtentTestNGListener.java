package reportsAndLogs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestNGListener implements ITestListener {
    private static ExtentReports extent = ExtentReportManager.getExtentReports();
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
    private static Logger log= LogManager.getLogger(ExtentTestNGListener.class);;

    
    public void onTestStart(ITestResult result) {
        ExtentTest test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
        log.info("Execution started");
    }

    
    public void onTestSuccess(ITestResult result) {
    	extentTest.get().pass("Test Passed");
        log.info(result.getMethod().getMethodName()+" Completed working with this test test");
        
    }

    
    public void onTestFailure(ITestResult result) {
    	log.info(result.getMethod().getMethodName()+" failed working with this test test");
        
        extentTest.get().fail("Test Failed: " + result.getThrowable());
    }

    
    public void onTestSkipped(ITestResult result) {
        extentTest.get().skip("Test Skipped: " + result.getThrowable());
    }

    
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}

