package TestNGDemos.Demo3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassOne {

    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }
    @Test (groups = "email")
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }
    @Test //(enabled = false)
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
