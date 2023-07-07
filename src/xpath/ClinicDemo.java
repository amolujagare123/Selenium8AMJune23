package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClinicDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://openclinic.sourceforge.net/openclinic/admin/staff_list.php");

        String name = "Giovanni";

        WebElement edit = driver.findElement(By.xpath("//tr[td[text()='"+name+"']]//img[@alt='edit']"));
        edit.click();


    }
}
