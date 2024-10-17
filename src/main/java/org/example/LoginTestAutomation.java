package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTestAutomation {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();

    }

    @Test
    public void Test() {

        LoginPageAutomation loginPageAutomation = new LoginPageAutomation(driver);
        loginPageAutomation.setUsername("student");
        loginPageAutomation.setPassword("Password123");
        loginPageAutomation.clickSubmit();


    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

}
