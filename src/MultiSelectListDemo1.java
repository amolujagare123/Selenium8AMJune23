import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListDemo1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/amol.html");

        // 1. find element
        WebElement multiSelList = driver.findElement(By.id("multiSel"));

        // 2. create the object of Select class
        Select selList = new Select(multiSelList);

        Thread.sleep(4000);
        // 3. select the option / item ( by visible text / value / index )
        selList.selectByVisibleText("text 3");
        selList.selectByVisibleText("text 1");
        selList.selectByIndex(3);

        Thread.sleep(4000);
       /* selList.deselectByIndex(0);
        selList.deselectByIndex(2);*/

        selList.deselectAll();

    }
}
