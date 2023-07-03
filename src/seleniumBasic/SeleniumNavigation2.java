package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNavigation2 {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://goals.amolujagare.in");
       // driver.navigate().to("http://selenium.dev");
        driver.get("http://selenium.dev");



    }
}
