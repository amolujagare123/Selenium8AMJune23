package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo {

    @Test
    public void myAlertDemo1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

     //   driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

    //    driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();



        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Amol Ujagare");
        alert.accept();
       // alert.dismiss();



    }
}
