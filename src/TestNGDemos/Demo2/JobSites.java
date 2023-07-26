package TestNGDemos.Demo2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JobSites extends OpenCloseBrowser{

      @Test
    public void naukri()
    {
        driver.get("http://naukri.com");


    }

    @Test
    public void fountIt()
    {
        driver.get("https://www.foundit.in/");
    }

    @Test
    public void shine()
    {
        driver.get("http://shine.com");
        Assert.assertEquals(driver.getTitle(),"my naukri",
                "this is not a correct page");
    }


    @Test
    public void timesJobs()
    {
        driver.get("http://timesjobs.com");
    }

}
