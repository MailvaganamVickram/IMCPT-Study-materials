package com.guru99.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.TestApp;

public class RegisterPage {
    WebDriver driver = TestApp.getInstance().getDriver();
    public void setFirstName(String firstname){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='firstName']"),10);
        WebElement fname= driver.findElement(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='firstName']"));
        fname.sendKeys(firstname);
    }
    public void setLastName(String lastname){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='lastName']"),10);
        WebElement enterLastname = driver.findElement
                (By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='lastName']"));
        enterLastname.sendKeys(lastname);
    }

    public void setMobile ( String mobile){
        TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='phone']"),10);
        WebElement enterPhoneNo = driver.findElement
                (By.xpath("//*[@style='font-family:Arial, Helvetica;font-size:13px;color:#000;padding:5px;']//input[@name='phone']"));
        enterPhoneNo.sendKeys(mobile);
    }

    public void setEmail( String username){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("userName"),10);
        WebElement enterEmail = driver.findElement
                (By.id("userName"));
        enterEmail.sendKeys(username);
    }
    public void setAddress( String address){
       TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//input[@name='address1']"),10);
        WebElement enterAddress = driver.findElement
                (By.xpath("//input[@name='address1']"));
        enterAddress.sendKeys(address);
    }

    public void selectCountry( String countryName){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("country"),10);
        Select CountryDropdown = new Select
                (driver.findElement(By.name("country")));
        CountryDropdown.selectByVisibleText(countryName);
    }

    public void setUserName( String email){
        TestApp.getInstance().waitUntilNextElementAppears(By.id("email"),10);
        WebElement userName = driver.findElement
                (By.id("email"));
        userName.sendKeys(email);

    }


    public void setPassword(String password){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("password"),10);
        WebElement psw = driver.findElement
                (By.name("password"));
        psw.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        TestApp.getInstance().waitUntilNextElementAppears(By.name("confirmPassword"),10);
        WebElement Confirmpwd = driver.findElement
                (By.name("confirmPassword"));
        Confirmpwd.sendKeys(confirmPassword);
    }

    public void submit(){
       TestApp.getInstance().waitUntilNextElementAppears(By.xpath("//*[@name='submit']"),10);
        WebElement submitButton = driver.findElement
                (By.xpath("//*[@name='submit']"));
        submitButton.click();
    }
}

