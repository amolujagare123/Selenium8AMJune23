package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatatableXpath2 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost/ip");

        WebElement txtUsername = driver.findElement(By.xpath("//input[@id='email']"));
        txtUsername.sendKeys("amolujagare@gmail.com");

        WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
        txtPassword.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
        btnLogin.click();


        driver.findElement(By.xpath("//span[normalize-space()='Clients']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='View Clients']")).click();


        String name="Ajay Singh";
        driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//div")).click();
      //  driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//li[2]")).click();
      //  driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//a[contains(@href,'form')]")).click();
      //  driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//a[normalize-space()='Edit']")).click();
        driver.findElement(By.xpath("//tr[td/a[text()='"+name+"']]//i[contains(@class,'edit')]")).click();
    }
}
