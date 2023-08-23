package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PopupDemo {


    @Test
    public void myPopUpTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.asianpaints.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.switchTo().frame("preview-notification-frame");


        driver.findElement(By.xpath("//input[@id='NC_INPUT_TEXT1']")).sendKeys("amol@gmail.com");
        Thread.sleep(4000);

        driver.findElement(By.xpath("//a[@id='NC_CLOSE_ICON']")).click();


    }
}
