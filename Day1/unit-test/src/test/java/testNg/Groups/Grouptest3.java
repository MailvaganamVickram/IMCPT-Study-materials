package testNg.Groups;

import org.testng.annotations.Test;

public class Grouptest3 {

    @Test(groups ={"Smoke"} )
    public void testGTest3M1(){
        System.out.println("GT3_M1");
    }
    @Test
    public void testGTest3M2(){
        System.out.println("GT3_M2");
    }
    @Test(groups = {"Regression"})
    public void testGTest3M3(){
        System.out.println("GT3_M3");
    }

    @Test(groups = {"Regression"})
    public void testGTest3M4(){
        System.out.println("GT3_M3");
    }

    @Test
    public void testGTest3M5(){
        System.out.println("GT3_M3");
    }


}
