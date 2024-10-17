package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {
    WebDriver driver;
@org.testng.annotations.BeforeClass
 void setup(){
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();


 }
 @org.testng.annotations.Test
 public void testLogin(){

    LoginPage loginPage = new LoginPage(driver);
    loginPage.setUserName("Admin");
    loginPage.setPassword("admin123");
    loginPage.clickLogin();


 }
 @org.testng.annotations.AfterClass
 public void tearDown(){
    driver.quit();

 }
}
