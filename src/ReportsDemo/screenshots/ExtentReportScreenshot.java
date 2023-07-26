package ReportsDemo.screenshots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportScreenshot {


    public static String getExtentReportScreenshot(WebDriver driver) throws IOException {
        // 1. create an object reference of TakesScreenshot as ts
        // assign the current driver to it.type cast it to
        // (TakesScreenshot)
        TakesScreenshot ts = (TakesScreenshot) driver;

        // 2. call the method getScreenshotAs() using ts
        // that is an object reference of TakesScreenshot
        // store the result returned by this method into a
        // file object
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. convert this file object into a real image file
        // if needed download common io jar
        FileUtils.copyFile(srcFile,new File("Report\\screenshots\\"+fileName));

        return fileName;
    }
}
