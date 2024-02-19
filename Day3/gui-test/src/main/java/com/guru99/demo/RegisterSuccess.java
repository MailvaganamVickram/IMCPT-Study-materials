package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterSuccess {

    public String getUsersuccess(WebDriver driver){
        waitUntilNextElementAppears(driver,
                By.xpath("//*[contains(text(),'Dear')]"),2);

       return driver.findElement(By.
               xpath("//*[contains(text(),'Dear')]")).getText();
    }

    public String  testemailsuccess(WebDriver driver){
        waitUntilNextElementAppears(driver,
                By.xpath("//*[contains(text(),'Note')]"),10);
       return driver.findElement
                (By.xpath("//*[contains(text(),'Note')]")).getText();

    }

    private WebElement waitUntilNextElementAppears(WebDriver driver, By locaior, int timeout){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                ExpectedConditions.presenceOfElementLocated(locaior));
        return element;
    }
}
