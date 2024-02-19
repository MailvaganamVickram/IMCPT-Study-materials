package testNg.Groups;

import org.testng.annotations.Test;

public class Grouptest4 {
    @Test(groups = {"Regression"})
    public void testGTest4M1(){
        System.out.println("GT4_M1");
    }
    @Test(groups = {"Smoke","Regression"})
    public void testGTest4M2(){
        System.out.println("GT4_M2");
    }
    @Test(groups = {"Regression"})
    public void testGTest4M3(){
        System.out.println("GT4_M3");
    }
    @Test
    public void testGTest4M4(){
        System.out.println("GT4_M4");
    }
    @Test(groups = {"Regression"})
    public void testGTest4M5(){
        System.out.println("GT4_M5");
    }
}
