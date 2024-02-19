package testNg.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class TestNGAnnotationstest2 {

    @Test
    public void test1() {
        System.out.println("Hello world");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After method");
    }





}
