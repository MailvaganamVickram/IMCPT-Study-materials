package testNg.Annotations;

import org.testng.annotations.*;

public class TestNGAnnotationtest5 {


    @Test
    public void login() {
        System.out.println("Login");
    }

    @Test
    public void testCreate() {
        System.out.println("Create");
    }

    @Test
    public void testEdit () {
        System.out.println("Edit");
    }

    @Test
    public void testDelete() {
        System.out.println("Delete");
    }

    @Test
    public void logOut() {
        System.out.println("LogOut");
    }
}
