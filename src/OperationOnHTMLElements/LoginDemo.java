package OperationOnHTMLElements;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


       // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cus")).click();

        driver.findElement(By.name("name")).sendKeys("Ravi");
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("354545");
        driver.findElement(By.name("contact2")).sendKeys("767679");
        driver.findElement(By.name("Submit")).click();

       /* By loginUsername = By.id("login-username");
        WebElement txtUsername = driver.findElement(By.id("login-username"));
        WebElement txtUsername2 = driver.findElement(loginUsername);*/

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
        FileUtils.copyFile(srcFile,new File("D:\\screenshots\\"+fileName));




    }
}
