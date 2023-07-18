package TestNGDemos.ParameterizationDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {

    @Parameters({"myUrl","username","password"})
    @BeforeClass
    public void beforeMyClass(String url,String user,String pass)
    {
        System.out.println("URL="+url);
        System.out.println("user="+user);
        System.out.println("pass="+pass);
    }
    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }
    @Test
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
