package testNg.Groups;

import org.testng.annotations.Test;

public class Groupstest1 {
    @Test(groups = {"Smoke","Regression"})
    public void testGTest1M1(){
        System.out.println("GT1_M");
    }
    @Test(groups = {"Smoke"})
    public void testGTest1M2(){
        System.out.println("GT1_M2");
    }
    @Test
    public void testGTest1M3(){
        System.out.println("GT1_M3");
    }
    @Test(groups = {"Regression"})
    public void testGTest1M4(){
        System.out.println("GT1_M4");
    }
    @Test(groups = {"Regression"})
    public void testGTest1M5(){
        System.out.println("GT1_M4");
    }
}
