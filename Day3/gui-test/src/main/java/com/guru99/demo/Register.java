package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Register {

    public void setFirstName(WebDriver driver, String firstname){
        waitUntilNextElementAppears(driver,By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='firstName']"),10);
       WebElement fname= driver.findElement(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='firstName']"));
       fname.sendKeys(firstname);
    }

    public void setLastName(WebDriver driver, String lastname){
        waitUntilNextElementAppears(driver,By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='lastName']"),10);
        WebElement enterLastname = driver.findElement
                (By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='lastName']"));
        enterLastname.sendKeys(lastname);
    }

    public void setMobile (WebDriver driver, String mobile){
        waitUntilNextElementAppears(driver,By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='phone']"),10);
        WebElement enterPhoneNo = driver.findElement
                (By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='phone']"));
        enterPhoneNo.sendKeys(mobile);
    }

    public void setEmail(WebDriver driver, String username){
        waitUntilNextElementAppears(driver,By.id("userName"),10);
        WebElement enterEmail = driver.findElement
                (By.id("userName"));
        enterEmail.sendKeys(username);
    }
    public void setAddress(WebDriver driver, String address){
        waitUntilNextElementAppears(driver,By.xpath("//input[@name='address1']"),10);
        WebElement enterAddress = driver.findElement
                (By.xpath("//input[@name='address1']"));
        enterAddress.sendKeys(address);
    }

    public void selectCountry(WebDriver driver, String countryName){
        waitUntilNextElementAppears(driver,By.name("country"),10);
        Select CountryDropdown = new Select
                (driver.findElement(By.name("country")));
        CountryDropdown.selectByVisibleText(countryName);
    }

    public void setUserName(WebDriver driver, String email){
        waitUntilNextElementAppears(driver,By.id("email"),10);
        WebElement userName = driver.findElement
                (By.id("email"));
        userName.sendKeys(email);

    }


    public void setPassword(WebDriver driver, String password){
        waitUntilNextElementAppears(driver,By.name("password"),10);
        WebElement psw = driver.findElement
                (By.name("password"));
        psw.sendKeys(password);
    }

    public void setConfirmPassword(WebDriver driver, String confirmPassword){
        waitUntilNextElementAppears(driver,By.name("confirmPassword"),7);
        WebElement Confirmpwd = driver.findElement
                (By.name("confirmPassword"));
        Confirmpwd.sendKeys(confirmPassword);
    }

    public void submit(WebDriver driver){
        waitUntilNextElementAppears(driver,By.xpath("//*[@name='submit']"),7);
        WebElement submitButton = driver.findElement
                (By.xpath("//*[@name='submit']"));
        submitButton.click();
    }


    private WebElement waitUntilNextElementAppears(WebDriver driver, By locaior, int timeout){
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(
                ExpectedConditions.presenceOfElementLocated(locaior));
        return element;
    }
}
