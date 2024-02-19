package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Home {

    public void clickOnRegisterLink(WebDriver driver){
        waitUntilNextElementAppears(driver,By.xpath("//a[@href='register.php']"),10);
        driver.findElement(By.xpath("//a[@href='register.php']")).click();
    }
    private WebElement waitUntilNextElementAppears(WebDriver driver, By locaior, int timeout){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                ExpectedConditions.presenceOfElementLocated(locaior));
        return element;
    }
}
