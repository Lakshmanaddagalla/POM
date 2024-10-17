package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    //constructor

    LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    //Locators

    By user_lct = By.xpath("//input[@placeholder='Password']");
    By pass_lct = By.xpath("//input[@placeholder='Password']");
    By button_lct = By.xpath("//button[normalize-space()='Login']");

    //Action methods
    public void setUserName(String userName) {
        driver.findElement(user_lct).sendKeys(userName);
    }
    public void setPassword(String password) {
        driver.findElement(pass_lct).sendKeys(password);
    }
    public void clickLogin() {
        driver.findElement(button_lct).click();
    }

}
