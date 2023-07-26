package ReportsDemo.ExtentReportsDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static ReportsDemo.screenshots.ExtentReportScreenshot.getExtentReportScreenshot;

public class LoginDemo {

    ExtentReports extent;
    @BeforeClass
    public void initExtentReport()
    {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/report.html");
        extent = new ExtentReports();
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

    }

    @AfterClass
    public void writeToReport()
    {
        extent.flush();
    }


    @Test
    public void loginTest1() throws IOException {
        ExtentTest test = extent.createTest("validLoginTest_001");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("http://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected  = "http://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("we are on dash board");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage()) ;
            test.addScreenCaptureFromPath("./screenshots/"+getExtentReportScreenshot(driver));
        }
    }
    @Test
    public void loginTest2() throws IOException {
        ExtentTest test = extent.createTest("invalidLoginTest_001");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("http://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("dsds");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("dsdsd");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected  = "http://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("we are on dash board");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage()) ;
            test.addScreenCaptureFromPath("./screenshots/"+getExtentReportScreenshot(driver));

        }
    }

    @Test
    public void loginTest3() throws IOException {
        ExtentTest test = extent.createTest("blankLoginTest_001");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        test.info("browser is opened and maximized");

        driver.get("http://stock.scriptinglogic.org/");

        test.info("URL is opened");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        test.info("username is entered");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        test.info("password is entered");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        test.info("login button is clicked");

        String expected  = "http://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();

        try {
            Assert.assertEquals(actual, expected, "this is not a dashboard");
            test.pass("we are on dash board");
        }
        catch (AssertionError e)
        {
            test.fail(e.getMessage()) ;
            test.addScreenCaptureFromPath("./screenshots/"+getExtentReportScreenshot(driver));

        }
    }
}
