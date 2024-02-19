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

public class LoginUser {
    WebDriver driver;
    @Test
    public void testLoginUser() throws Exception{
        setupBrowser();
        ScreenResolution();
        OpenTestSite();
        EntertCredentials();
        Orderpage();
    }

    public void setupBrowser(){
        ChromeOptions options = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        System.setProperty("C:/Selenium Driver/ChromeDrivers","webdriver.chrome.driver");
        this.driver = driver;
    }
    public void ScreenResolution(){driver.manage().window().maximize();}

    public void OpenTestSite(){driver.get(BASE_URL_LOGIN);}

    public void EntertCredentials(){

        driver.navigate().to("https://www.awaytravel.com/login");

        WebElement enterEmail = driver.findElement(By.id("login-email"));
        enterEmail.sendKeys(EMAIL);
        WebElement enterPassword = driver.findElement(By.id("login-password"));
        enterPassword.sendKeys(PASSWORD);
        WebElement enterSubmit = driver.findElement(By.xpath("//button[@aria-label='Log in']"));
        enterSubmit.click();
        String Title = driver.getTitle();
        Assert.assertEquals(Title, "Login | Away: Built for modern travel");

    }

    public void Orderpage(){
        driver.navigate().to("https://www.awaytravel.com/account/orders");
        driver.get("https://www.awaytravel.com/shop");

     WebElement selectproduct =   driver.findElement(By.xpath("//*[@id=\"products\"]/div/div/div[1]/div[1]/a/div[1]/div[2]/div/div/span/img"));
     selectproduct.click();
//div[@class='add-to-cart-desktop buy_box_body_addToCart__R6dMK buy_box_body_addToCartDesktop__k_i1t']//span[@class='button_copy__upy4D'][normalize-space()='Add To Cart $275']
     WebElement checkout = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section/div[1]/div[3]/section[2]/div[3]/button/div"));
     checkout.click();
    }

    @AfterClass
    public void CloseBrowser() throws InterruptedException {
        Thread.sleep(5000);
            driver.close();
    }
}
