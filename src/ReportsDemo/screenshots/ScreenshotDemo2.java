package ReportsDemo.screenshots;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo2 {

    @Test
    public void getScreenshot() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.get("https://facebook.com/");
        driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.13.0");



        // 1.find the element
       // WebElement loginBtn = driver.findElement(By.name("login"));
      //  WebElement statBox = driver.findElement(By.cssSelector(".box.box-stats"));

        WebElement table1 = driver.findElements(By.xpath("//table[@class='grid']")).get(0);

        // 2. call the method getScreenshotAs() using the above web element
        File srcFile = table1.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("_yyyMMdd_hhmmss").format(new Date());
        String fileName = "IMG"+timeStamp+".png";

        // 3. convert this file object into a real image file
        // if needed download common io jar
        FileUtils.copyFile(srcFile,new File("D:\\screenshots\\"+fileName));

    }

}
