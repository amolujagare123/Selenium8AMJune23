package ReportsDemo.com.amol;

import TestNGDemos.Demo2.OpenCloseBrowser;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static ReportsDemo.ExtentReportsDemo.ExtentReportListener.initExtentReportObject;
import static ReportsDemo.screenshots.ExtentReportScreenshot.getExtentReportScreenshot;
//import static TestNGDemos.Demo2.OpenCloseBrowser.driver;

public class ListenerExtentReport extends OpenCloseBrowser implements ITestListener {
    ExtentReports extent;
    ExtentTest test;
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getMethod().getMethodName());

    }

    public void onTestSuccess(ITestResult result) {
        test.pass("the test is passed");
    }

    public void onTestFailure(ITestResult result) {
        test.info("the test is failed");
        test.fail(result.getThrowable());
        try {
            test.addScreenCaptureFromPath("./screenshots/"+getExtentReportScreenshot(driver));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onTestSkipped(ITestResult result) {
        test.skip("the test is skipped");
    }


    public void onStart(ITestContext context) {
        if (extent==null)
            extent = initExtentReportObject();
    }

    public void onFinish(ITestContext context) {

        extent.flush();
    }
}
