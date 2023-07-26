package TestNGDemos.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SocialSites extends OpenCloseBrowser{



    @Test (priority = 4)
    public void facebook()
    {
        driver.get("http://facebook.com");
    }

    @Test (priority = 1)
    public void twitter()
    {
        driver.get("http://twitter.com");
    }

    @Test(priority = 3)
    public void instagram()
    {
        driver.get("http://instagram.com");
    }

    @Test (priority = 2)
    public void linkedin()
    {
        driver.get("http://linkedin.com");
    }

}
