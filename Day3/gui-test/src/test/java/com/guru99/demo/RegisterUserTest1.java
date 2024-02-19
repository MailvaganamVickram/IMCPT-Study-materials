package com.guru99.demo;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.PropertyFileReader;

import java.time.Duration;
import java.util.List;


import static com.guru99.demo.Java.Util.*;

public class RegisterUserTest1 {
    protected static String user_name = "Test@gmail.com";
    WebDriver driver;
    PropertyFileReader prop = new PropertyFileReader();
    String url = prop.getProperty("config","url");

    @BeforeClass
    void SetupBrowser(){
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        System.setProperty("C:/Selenium Driver/ChromeDrivers","webdriver.chrome.driver");
        this.driver=driver;
    }

    public void testRegisterNewUser() {
        SetupBrowser();
        ScreenResolution();
        OpenTestSite();
        EnterCredentials();
        checkUser();
        CloseBrowser();
    }

    @Test (priority = 0)
    public void ScreenResolution(){driver.manage().window().maximize();}

    @Test(priority = 1)
    public void OpenTestSite(){driver.get(url);}

    @Test (priority = 2)
    public void EnterCredentials(){
        List <WebElement> registerElements = driver.findElements
                (By.xpath("//a[@href='register.php']"));
        registerElements.get(1).click();


        WebElement enterUserName = driver.findElement
                (By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='firstName']"));
        enterUserName.sendKeys("TestFirstname");

        WebElement enterLastname = driver.findElement
                (By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='lastName']"));
        enterLastname.sendKeys("TestLastName");

        WebElement enterPhoneNo = driver.findElement
                (By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='phone']"));
        enterPhoneNo.sendKeys("0123456789");

        WebElement enterEmail = driver.findElement
                (By.id("userName"));
        enterEmail.sendKeys(user_name);

        WebElement enterAddress = driver.findElement
                (By.xpath("//input[@name='address1']"));
        enterAddress.sendKeys("TestAddress");

        WebElement enterCity = driver.findElement
                (By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//*[@name='city']"));
        enterCity.sendKeys("Colombo");

        WebElement enterState = driver.findElement
                (By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//*[@name='state']"));
        enterState.sendKeys("Westerns");

        WebElement enterPostalcode = driver.findElement
                (By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//*[@name='postalCode']"));
        enterPostalcode.sendKeys("0015");

        //Select dropdown by Text
        Select CountryDropdown = new Select
                (driver.findElement(By.name("country")));
        CountryDropdown.selectByVisibleText("SRI LANKA");

        WebElement userName = driver.findElement
                (By.id("email"));
        userName.sendKeys(EMAIL);

        WebElement password = driver.findElement
                (By.name("password"));
        password.sendKeys(PASSWORD);

        WebElement Confirmpassword = driver.findElement
                (By.name("confirmPassword"));
        Confirmpassword.sendKeys(PASSWORD);

        waitUntilNextElementAppears(By.xpath("//*[@name='submit']"),2);
        WebElement submitButton = driver.findElement
                (By.xpath("//*[@name='submit']"));
        submitButton.click();
    }

    @Test (priority = 3 )
    public void checkUser(){
        waitUntilNextElementAppears(By.xpath("//*[contains(text(),'Dear')]"),2);
        String message = driver.findElement(By.xpath
                ("//*[contains(text(),'Dear')]")).getText();
        Assert.assertEquals(message,"Dear TestFirstname TestLastName,");

        String email = driver.findElement
                (By.xpath("//*[contains(text(),'Note')]")).getText();
        Assert.assertEquals(email,"Note: Your user name is test@gmail.com." );
    }

    @AfterClass
    public void CloseBrowser() {
        driver.quit();
    }
    private WebElement waitUntilNextElementAppears(By locaior, int timeout){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                ExpectedConditions.presenceOfElementLocated(locaior));
        return element;
    }


}


