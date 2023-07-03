package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo4 {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();

        driver.get("http://goals.amolujagare.in");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());



    }
}
