package Away.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static Away.test.util.BASE_URL;
public class AddtoCart {
    WebDriver driver;
@Test
    public  void testCart (){
        setupBrowser();
        ScreenResolution();
        OpenTestSite();
        shopnow();

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

    public void OpenTestSite(){driver.get(BASE_URL);}

    public void shopnow(){
        WebElement shop = driver.findElement
                (By.xpath("//*[@id=\"main-content\"]/div/div[1]/section/div[2]/div/a"));
        shop.click();

        driver.findElement(By.xpath( "/html[1]/body[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[2]/span[1]/img[1]")).click();
        //driver.get("https://www.awaytravel.com/suitcases/carry-on-flex?color=coast_blue");

        WebElement addtocart = driver.findElement(By.xpath("//div[@class='add-to-cart-desktop buy_box_body_addToCart__R6dMK buy_box_body_addToCartDesktop__k_i1t']//span[@class='button_copy__upy4D'][normalize-space()='Add To Cart $325']"));
        addtocart.click();

        WebElement viewcart = driver.findElement
                (By.xpath("//span[@class='button_copy__upy4D']//span[contains(text(),'View Cart')]"));
        viewcart.click();

        WebElement checkout = driver.findElement
                (By.xpath("//a[@class='component component-anchor-tag anchor_tag_component__zYlYw summary_checkoutButton__Zfa_1']"));
        checkout.click();

    }
    @AfterClass
    public void CloseBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }


}
