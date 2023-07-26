package ReportsDemo.ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportListener {
    public static ExtentReports initExtentReportObject()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);

        reporter.config().setReportName("Stock Management system Testing report");
        reporter.config().setDocumentTitle("regression testing");

        extent.setSystemInfo("Project Name","Stock Management system");
        extent.setSystemInfo("Developers Name","Sundarmala");
        extent.setSystemInfo("Enviornment","Production");
        extent.setSystemInfo("Tester Name","Kavitha");
        extent.setSystemInfo("Lead By","Radhey");

        String buildID = "Build_"+new SimpleDateFormat("yyyyddMM_hhmmss").format(new Date());
        extent.setSystemInfo("Build ID",buildID);
        extent.setSystemInfo("Version",buildID);

        return extent;

    }

}
