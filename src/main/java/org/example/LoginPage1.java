package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
    WebDriver driver;
    //constructor

    LoginPage1(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    //Locators
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement username;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement password_;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;
//    By user_lct = By.xpath("//input[@placeholder='Password']");
//    By pass_lct = By.xpath("//input[@placeholder='Password']");
//    By button_lct = By.xpath("//button[normalize-space()='Login']");

    //Action methods
    public void setUserName(String userName) {
        username.sendKeys(userName);
    }

    public void setPassword(String password) {
        password_.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

}

