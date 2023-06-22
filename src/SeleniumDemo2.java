import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("http://gmail.com");

        driver.get("http://goals.amolujagare.in");


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(4000);
        // driver.close(); // closes the current window
        driver.quit();// closes the all windows opened by the driver

    }
}
