import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        List<WebElement> wbList = driver.findElements(By.tagName("input"));
        System.out.println("size="+wbList.size());

        wbList.get(0).sendKeys("admin");
        wbList.get(1).sendKeys("admin");
        wbList.get(2).click();

        driver.findElement(By.linkText("Add Supplier")).click();

        List<WebElement> inputSupplierList = driver.findElements(By.tagName("input"));

        inputSupplierList.get(2).sendKeys("Avinash"); // name
        inputSupplierList.get(3).sendKeys("6565656"); // contact1
        inputSupplierList.get(4).sendKeys("8686868"); // contact2

        inputSupplierList.get(5).click();
    }
}
