package com.guru99.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

public class RegisterUserTest2 {

    WebDriver driver;
    PropertyFileReader prop = new PropertyFileReader();
    String url = prop.getProperty("config","url");

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        System.setProperty("C:/Selenium Driver/ChromeDrivers","webdriver.chrome.driver");
        this.driver=driver;
        driver.get(url);
        driver.manage().window().maximize();
        Home home = new Home();
        home.clickOnRegisterLink(driver);
    }

    @Test
    public void testRegisterUser() {
        Register regUser = new Register();
        regUser.setFirstName(driver,"TestFirstName");
        regUser.setLastName(driver,"TestLastName");
        regUser.setMobile(driver,"0772744340");
        regUser.setEmail(driver,"Test@gmail.com");
        regUser.setAddress(driver,"TestAddress");
        regUser.selectCountry(driver,"SRI LANKA");
        regUser.setUserName(driver,"TestUsername");
        regUser.setPassword(driver,"123456");
        regUser.setConfirmPassword(driver,"123456");
        regUser.submit(driver);
        RegisterSuccess regSuccess = new RegisterSuccess();
        String actualmsg = regSuccess.getUsersuccess(driver);
        Assert.assertEquals(actualmsg,"Dear TestFirstName TestLastName,");
        String actualmsg2 = regSuccess.testemailsuccess(driver);
        Assert.assertEquals(actualmsg2,"Note: Your user name is TestUsername.");
    }

    @AfterMethod
    public void closebrowser() {
        driver.close();
    }
}
