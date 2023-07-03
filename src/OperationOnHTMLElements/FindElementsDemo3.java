package OperationOnHTMLElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo3 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");

        List<WebElement> wbList = driver.findElements(By.tagName("a"));
        System.out.println("size="+wbList.size());

        for (int i=0;i<wbList.size();i++)
        {
           if(wbList.get(i).getText().contains("DOM"))
              System.out.println(wbList.get(i).getText()); // print string containing "DOM"
        }


       /* for (WebElement link:wbList) {
            System.out.println(link.getText());
        }*/


    }
}
