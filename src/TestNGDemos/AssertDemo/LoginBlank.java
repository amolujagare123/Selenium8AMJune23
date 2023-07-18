package TestNGDemos.AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginBlank {

    @Test
    public void loginTest3()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


        String[] expected = {"PLEASE ENTER A USERNAME","PLEASE PROVIDE A PASSWORD"};
        String[] actual = new String[2];

        try {

            List<WebElement> wbList = driver.findElements(By.xpath("//*[@class='error']"));
            actual[0] = wbList.get(0).getText();
            actual[1] =  wbList.get(1).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("Expected result.....");

        for (int i=0;i<expected.length;i++)
            System.out.println(expected[i]);

        System.out.println("Actual result.....");

        for (int i=0;i<actual.length;i++)
            System.out.println(actual[i]);


        Assert.assertEquals(actual,expected,"incorrect or no error message");


    }
}
