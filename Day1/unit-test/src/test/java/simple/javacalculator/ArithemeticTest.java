package simple.javacalculator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.Calculator.ArithmaticOPerator;

public class ArithemeticTest {

    ArithmaticOPerator calc;

    @BeforeMethod
    public void setUp() {

        calc = new ArithmaticOPerator();
    }

    @Test(groups = {"Positive"})
    public void testSum() {
        Assert.assertEquals
                (calc.sum(50,60),110,"calculator is not working ");
    }

    @Test(groups = {"Negative","Positive"})
    public void testSum2() {

        Assert.assertEquals
                (calc.sum(-70,10),-60,"calculator is not working ");
    }
    @Test(groups = {"Negative"})
    public void testSum3() {

        Assert.assertEquals
                (calc.sum(-70,-10),-80,"calculator is not working ");
    }
    @Test(groups = {"Zero","Positive"})
    public void testSum4() {

        Assert.assertEquals
                (calc.sum(0,5),5,"calculator is not working ");
    }
    @Test(groups = {"Zero"})
    public void testSum5() {

        Assert.assertEquals
                (calc.sum(0,0),0,"calculator is not working ");
    }


}
