package testNg.Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestngAssertiontest1 {

    @Test
    public void testAssertEquals() {
        String actualmsg = "Hello world";
        String expectedmsg="Hello world";

        System.out.println("Before assertion");
        Assert.assertEquals(actualmsg,expectedmsg, "Test failed" );
        System.out.println("After assertion");
    }
    @Test(priority = 0)
    public void testAssertNotEquals() {
        String actualmsg = "Hello world";
        String expectedmsg="Hell world";

        System.out.println("Before assertion");
        Assert.assertNotEquals(actualmsg,expectedmsg, "Test failed" );
        System.out.println("After assertion");
    }

    @Test
    public void testAssertTrue() {
        boolean actual = true;

        Assert.assertTrue(actual,"Boolena match");
    }

    @Test
    public void testAssertFalse() {

        boolean actual = false;

        Assert.assertFalse(actual,"Boolean matching");

    }
}


