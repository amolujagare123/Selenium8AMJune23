package TestNGDemos.AssertDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {

   /*@Test
    public void loginTest1()
    {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin1");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

      *//*  String expected  = "http://stock.scriptinglogic.org/dashboard.php";
        String actual = driver.getCurrentUrl();*//*

       *//* String expected = "POSNIC - Dashboard";
        String actual = driver.getTitle();*//*

        String expected = "Dashboard";
        String actual = "";
        try {
             actual = driver.findElement(By.xpath("//a[@class='active-tab dashboard-tab']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"this is not a dashboard");
    }*/

  /*  @Test
    public void loginTest2()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        String expected = "Wrong Username or Password";
        String actual = "";

        try {
            actual = driver.findElement(By.xpath("//div[@class='error-box round']")).getText();
        }
        catch (Exception e)
        {

        }
        System.out.println("actual="+actual);
        System.out.println("expected="+expected);

        Assert.assertEquals(actual,expected,"incorrect or no error message");
    }*/

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
            actual[0] = driver.findElement(By.xpath("//label[@for='login-username'][@class='error']")).getText();
            actual[1] = driver.findElement(By.xpath("//label[@for='login-password'][@class='error']")).getText();
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
