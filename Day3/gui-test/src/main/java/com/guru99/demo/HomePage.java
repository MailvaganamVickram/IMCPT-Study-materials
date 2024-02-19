package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.TestApp;

public class HomePage {

    WebDriver driver = TestApp.getInstance().getDriver();
    public void clickOnRegisterLink(){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//a[@href='register.php']"),10);
        driver.findElement(By.xpath("//a[@href='register.php']")).click();
    }
}
