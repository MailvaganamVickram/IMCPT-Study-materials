package com.guru99.demo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.TestApp;

import java.util.concurrent.ThreadPoolExecutor;

public class RegisterUserTest3 {
    RegisterPage registerPage;
    HomePage homePage ;
    RegisterSuccess registerSuccess;
    @BeforeMethod
    public void setUp() {
        TestApp.getInstance().openBrowser();
        TestApp.getInstance().navigateToURL();
        homePage = new HomePage();
        homePage.clickOnRegisterLink();
    }

    @Test
    public void testRegisterNewUser() {
        registerPage = new RegisterPage();
    registerPage.setFirstName("TestFirstname3");
    registerPage.setLastName("TestLastname3");
    registerPage.setMobile("0772744340");
    registerPage.setEmail("Test@gmail.com");
    registerPage.setAddress("TestAdddress");
    registerPage.selectCountry("SRI LANKA");
    registerPage.setUserName("Tester");
    registerPage.setPassword("123456789");
    registerPage.setConfirmPassword("123456789");
    registerPage.submit();
    registerSuccess = new RegisterSuccess();

    String actualmessage = registerSuccess.getUsersuccess(registerPage.driver);
        Assert.assertEquals(actualmessage,"Dear TestFirstname3 TestLastname3,");

    String actualmessage2 = registerSuccess.testemailsuccess(registerPage.driver);
    Assert.assertEquals(actualmessage2,"Note: Your user name is Tester.");

    }

    @AfterMethod
    public void tearDown() {
    TestApp.getInstance().closeBrowser();
    }
}

