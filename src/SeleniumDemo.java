import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumDemo {

    public static void main(String[] args) {

       // WebDriver driver = new ChromeDriver(); //upcasting
        WebDriver driver = new FirefoxDriver(); //upcasting
        // WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("http://facebook.com");

    }
}
