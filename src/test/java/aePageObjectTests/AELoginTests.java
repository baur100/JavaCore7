package aePageObjectTests;

import aePageObjects.AELoginPage;
import aePageObjects.AEMainPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.time.Duration;

public class AELoginTests {
    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void loginToKoel_CorrectCredentials_SuccessfulLogin() throws InterruptedException {
        AELoginPage loginPage = new AELoginPage(driver);
        loginPage.open();
        AEMainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());

    }
    @Test
    public void loginToKoel_IncorrectCredentials_ErrorFrame() throws InterruptedException {
        AELoginPage loginPage = new AELoginPage(driver);
        loginPage.open();
        loginPage.login("koeluser06@testpro.io", "wrongpassword");
        Assert.assertTrue(loginPage.isError());
    }

}
