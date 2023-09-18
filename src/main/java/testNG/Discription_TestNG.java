package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Discription_TestNG {

   // @Test(priority = 2)
    @Test
    public void tc1(){
        System.out.println("mobile login testcase");
    }

    //@Test(priority = 3)
    @Test(dependsOnMethods = {"tc3"})
   // @Test
    public void tc2(){
        System.out.println("web login testcase");
    }

    //@Test(priority = 1)
    @Test
    public void tc3(){
        System.out.println("auto login tc3");

    }
}
