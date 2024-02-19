package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.TestApp;


public class RegisterSuccessPage {

    WebDriver driver = TestApp.getInstance().getDriver();
    public String getUsersuccess(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[contains(text(),'Dear')]"),0);
        return driver.findElement(By.
                xpath("//*[contains(text(),'Dear')]")).getText();
    }

    public String emailSuccess(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[contains(text(),'Note')]"),0);
        return driver.findElement(By.
                xpath("//*[contains(text(),'Note')]")).getText();

    }

}
