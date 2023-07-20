package TestNGDemos.AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddCustomer3 {

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


        driver.findElement(By.name("Submit")).click();

        String expected = "PLEASE ENTER A CUSTOMER NAME";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//label[@class='error']")).getText();

        } catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        boolean result = actual.contains(expected);

        Assert.assertTrue(result,"user is not added");
    }
}
