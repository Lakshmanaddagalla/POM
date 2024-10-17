package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAutomation {
    WebDriver driver;

    LoginPageAutomation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement submit;


    public void setUsername(String name) {
        username.sendKeys(name);
    }

    public void setPassword(String pass) {
        password.sendKeys(pass);

    }

    public void clickSubmit() {

        submit.click();
    }
}
