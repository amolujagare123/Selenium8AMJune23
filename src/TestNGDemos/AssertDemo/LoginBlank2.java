package TestNGDemos.AssertDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LoginBlank2 {

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


        /*String[] expected = {"PLEASE ENTER A USERNAME","PLEASE PROVIDE A PASSWORD"};
        String[] actual = new String[2];*/

        ArrayList<String> expected = new ArrayList<>();
        expected.add("PLEASE ENTER A USERNAME");
        expected.add("PLEASE PROVIDE A PASSWORD");

        ArrayList<String> actual = new ArrayList<>();
        try {

            List<WebElement> wbList = driver.findElements(By.xpath("//*[@class='error']"));
            actual.add(wbList.get(0).getText());
            actual.add(wbList.get(1).getText());

        }
        catch (Exception e)
        {

        }
        System.out.println("Expected result.....");

        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"incorrect or no error message");


    }
}
