package TestNGDemos.AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddCustomer4 {

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

        String name = "Ra";

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys("xy");
        driver.findElement(By.name("contact1")).sendKeys("35");
        driver.findElement(By.name("contact2")).sendKeys("76");
        driver.findElement(By.name("Submit")).click();



        ArrayList<String> expected = new ArrayList<>(){{
            add("CUSTOMER MUST CONSIST OF AT LEAST 3 CHARACTERS");
            add("PLEASE ENTER AT LEAST 3 CHARACTERS.");
            add("CUSTOMER ADDRESS MUST BE AT LEAST 3 CHARACTERS LONG");
            add("PLEASE ENTER AT LEAST 3 CHARACTERS.");
        }};

        ArrayList<String> actual = new ArrayList<>();


        try {
            List<WebElement> wbList = driver.findElements(By.xpath("//label[@class='error']"));

            actual.add(wbList.get(0).getText());
            actual.add(wbList.get(1).getText());
            actual.add(wbList.get(2).getText());
            actual.add(wbList.get(3).getText());

        } catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"incorrect or no error message");
    }
}
