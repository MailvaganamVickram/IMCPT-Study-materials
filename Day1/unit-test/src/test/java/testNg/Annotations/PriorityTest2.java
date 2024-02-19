package testNg.Annotations;

import org.testng.annotations.Test;

public class PriorityTest2 {

    @Test(priority = 1)
    public void login() {
        System.out.println("Login");
    }


    @Test(priority = 2)
    public void testCreate() {
        System.out.println("Create");
    }

    @Test(priority = 3)
    public void testEdit () {
        System.out.println("Edit");
    }

    @Test(priority = 4)
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test()
    public void logOut() {
        System.out.println("LogOut");
    }


}
