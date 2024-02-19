package testNg.Groups;

import org.testng.annotations.Test;

public class Groupstest2 {

    @Test (groups = {"Regression"})
    public void testGTest2M1(){
        System.out.println("GT2_M1");
    }
    @Test(groups = {"Smoke"})
    public void testGTest2M2(){
        System.out.println("GT2_M2");
    }
    @Test(groups = {"Smoke","Regression"})
    public void testGTest2M3(){
        System.out.println("GT2_M3");
    }
    @Test
    public void testGTest2M4(){
        System.out.println("GT2_M4");
    }
    @Test
    public void testGTest2M5(){
        System.out.println("GT2_M5");
    }

}
