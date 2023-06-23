import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNavigation {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://goals.amolujagare.in");
        driver.navigate().to("http://selenium.dev");
        Thread.sleep(4000);

        driver.navigate().back();

        Thread.sleep(4000);
        driver.navigate().forward();

        Thread.sleep(4000);
        driver.navigate().refresh();

    }
}
