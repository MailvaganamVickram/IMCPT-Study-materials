package Away.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static Away.test.util.*;

public class RegistrationUser {
    WebDriver driver;

    @Test
    public void testRegisterNewUser() throws Exception {
        SetupBrowser();
        ScreenResolution();
        OpenTestSite();
        EnterCredentials();
        CloseBrowser();

    }


    void SetupBrowser(){
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        System.setProperty("C:/Selenium Driver/ChromeDrivers","webdriver.chrome.driver");
        this.driver = driver;
    }


    public void ScreenResolution(){driver.manage().window().maximize();}

    public void OpenTestSite(){driver.get(BASE_URL_REGISTER);}


    public void EnterCredentials(){

        WebElement userName = driver.findElement
                (By.id("login-email"));
        userName.sendKeys(EMAIL);

        WebElement password = driver.findElement
                (By.name("password"));
        password.sendKeys(PASSWORD);

        String message = driver.findElement(By.xpath
                ("//*[@class='layout_account__NgoAc']//*[@class='details_heading__pweoG']")).getText();
        Assert.assertEquals(message,"Edit Account Details");

        WebElement FirstName = driver.findElement
                (By.id("edit-first-name"));
        FirstName.sendKeys("TestFirstname");

        WebElement LastName = driver.findElement
                (By.id("edit-last-name"));
        LastName.sendKeys("TestLastname");


        WebElement submitButton = driver.findElement
                (By.xpath("//*[@class='layout_account__NgoAc']//*[@class='button_overlay__IUmCY button_secondaryOverlay__GkyBZ button_secondaryHoverEnter__y22J7']"));
        submitButton.click();

    }

    @AfterClass
    public void CloseBrowser() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}
