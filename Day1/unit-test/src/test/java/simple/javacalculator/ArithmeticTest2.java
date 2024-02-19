package simple.javacalculator;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import simple.Calculator.ArithmaticOPerator;

public class ArithmeticTest2 {

    ArithmaticOPerator calc;
    @BeforeMethod
    public void setUp() {
        calc = new ArithmaticOPerator();
    }

    @Test
    public void testSum1() {Assert.assertEquals(calc.sum(7,100),107,"calculator is not working ");
    }
    @Test
    public void testSum2() {
        Assert.assertEquals(calc.sum(-7,100),93,"calculator is not working ");
    }
    @Test
    public void testSum3() {
        Assert.assertEquals(calc.sum(-7,-100),-107,"calculator is not working ");
    }
    @Test
    public void testSum4() {
        Assert.assertEquals(calc.sum(7,-100),-93,"calculator is not working ");
    }


}
