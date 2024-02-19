package simple.javacalculator;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.Calculator.ArithmaticOPerator;

public class ArithmeticTest3 {

    ArithmaticOPerator calc;
    @BeforeMethod
    public void setUp() {
        calc = new ArithmaticOPerator();
    }

    @Test(dataProvider = "sumTestData")
    public void testSum1(int input1, int input2, int output) {

        Assert.assertEquals(calc.sum(input1,input2),output,
                "Failed to calculate");
    }
    @Test(dataProvider = "subTestData")
    public void testsub(int input1, int input2, int output){
        Assert.assertEquals(calc.sub(input1,input2),output,"Failed to subtract");
    }
    @DataProvider
    public Object[][] subTestData(){
        return new Object[][]{
                {10,5,5},
                {25,10,15},
                {0,0,0},
                {-1,-2,1}
        };
    }

    @DataProvider
    public Object [][] sumTestData(){
        return new Object[][]{
                {7,100,107},
                {-7,100,93},
                {7,-100,-93},
                {1,0,1},
                {-1,0,-1},
                {0,0,0}

        };
    }


}
