package testNg.Annotations;

import org.testng.annotations.Test;

public class ProrityTest1 {

    @Test(priority = 0)
    public void login() {
        System.out.println("Login");
    }


    @Test(priority = 1)
    public void testCreate() {
        System.out.println("Create");
    }

    @Test(priority = 2)
    public void testEdit () {
        System.out.println("Edit");
    }

    @Test(priority = 3)
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test(priority = 4)
    public void logOut() {
        System.out.println("LogOut");
    }

}
