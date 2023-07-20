package TestNGDemos.AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomer {

    @Test
    public void addCustomer() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


        // driver.findElement(By.linkText("Add Customer")).click();
        driver.findElement(By.partialLinkText("Add Cus")).click();

        String name = "Radhey";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("xyz");
        driver.findElement(By.name("contact1")).sendKeys("354545");
        driver.findElement(By.name("contact2")).sendKeys("767679");
        driver.findElement(By.name("Submit")).click();

        String expected = "[ " + name + " ] Customer Details Added !";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//div[@class='confirmation-box round']")).getText();

        } catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"user is not added");
    }
}
