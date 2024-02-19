package testNg.Annotations;

import org.testng.annotations.Test;

public class Dependsonmethod {

    @Test
    public void login() {
        System.out.println("Login");
    }

    @Test(dependsOnMethods = {"login"})
    public void testCreate() {
        System.out.println("Create");
    }

    @Test(dependsOnMethods = {"login","testCreate"})
    public void testEdit () {
        System.out.println("Edit");
    }

    @Test(dependsOnMethods = {"testEdit"})
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test(dependsOnMethods = {"testDelete"})
    public void logOut() {
        System.out.println("LogOut");
    }
}
