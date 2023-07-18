package TestNGDemos.ParameterizationDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassThree {

    @Parameters({"myUrl","username","password"})
    @BeforeClass
    public void beforeMyClass(String url,String user,String pass)
    {
        System.out.println("URL="+url);
        System.out.println("user="+user);
        System.out.println("pass="+pass);
    }
    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }
    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }
    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
