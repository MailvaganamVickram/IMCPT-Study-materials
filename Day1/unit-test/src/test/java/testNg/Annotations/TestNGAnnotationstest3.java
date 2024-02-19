package testNg.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotationstest3 {



    @BeforeMethod
    public void setUp() {
        System.out.println("Before method");
    }

    @Test(priority = 2)
    public void test1() {
        System.out.println("Test1");
    }

    @Test(priority = 1)
    public void test2() {
        System.out.println("Test2");
    }


    @AfterMethod
    public void tearDown() {
        System.out.println("After method");
    }
}
