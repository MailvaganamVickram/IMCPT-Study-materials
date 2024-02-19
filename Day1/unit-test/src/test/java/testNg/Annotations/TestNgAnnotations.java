package testNg.Annotations;

import org.testng.annotations.Test;


public class TestNgAnnotations {

    public static void main(String[] args) {
        System.out.println("Print 0");
        TestNgAnnotations x=new TestNgAnnotations();
        x.print();
        x.print2();
        x.print3();


    }
    @Test
    public void print(){
        System.out.println("Print 1");
    }

    @Test
    public void print2(){
        System.out.println("Print 2");
    }
    @Test
    public void print3(){
        System.out.println("Print 3");
    }


}
