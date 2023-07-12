package JunitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestDemo {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();


        WebDriver driver1 = new ChromeDriver();
        driver1.manage().window().maximize();
        driver1.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername1 = driver1.findElement(By.id("login-username"));
        txtUsername1.sendKeys("jjkjk");

        WebElement txtPassword1 = driver1.findElement(By.id("login-password"));
        txtPassword1.sendKeys("kkll");

        WebElement btnLogin1 = driver1.findElement(By.name("submit"));
        btnLogin1.click();

        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername2 = driver2.findElement(By.id("login-username"));
        txtUsername2.sendKeys("jjkjk");

        WebElement txtPassword2 = driver2.findElement(By.id("login-password"));
        txtPassword2.sendKeys("kkll");

        WebElement btnLogin2 = driver2.findElement(By.name("submit"));
        btnLogin2.click();

    }
}
