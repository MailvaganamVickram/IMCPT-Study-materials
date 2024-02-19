package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenBrowser  {
    @BeforeMethod
    public void setUpBrowser() {

    }

    @Test
    public void testSearch() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/login");
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("admin@phptravels.com");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("demo12345");
        driver.findElement(By.xpath("//*[@class='login_button']/*[@id='submitBTN']")).click();
        Thread.sleep(5000);
        driver.close();

    }

}
