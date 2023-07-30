package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

import static DataProvider.util.FoDataProvider.getMyData;

public class AddCustomerDemo4 {
    WebDriver driver ;


    @Test (dataProvider = "getData")
    public void addCustomerTest(String username, String password, String name,String address,String contact1,String contact2)
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
        driver.findElement(By.partialLinkText("Add Cus")).click();

        driver.findElement(By.name("name")).sendKeys(name);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("contact1")).sendKeys(contact1);
        driver.findElement(By.name("contact2")).sendKeys(contact2);

        driver.findElement(By.name("Submit")).click();
    }

    @DataProvider
    Object[][] getData() throws IOException {

       return getMyData("data/Data-1.xlsx","addCustomer with login");
    }

}
