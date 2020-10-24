package aePageObjectTests;

import aePageObjects.AELoginPage;
import aePageObjects.AEMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AELoginTests extends AEBaseTest{
    @Test
    public void loginToKoel_CorrectCredentials_SuccessfulLogin(){
        AELoginPage loginPage = new AELoginPage(driver);
        loginPage.open();
        AEMainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginToKoel_IncorrectCredentials_ErrorFrame(){
        AELoginPage loginPage = new AELoginPage(driver);
        loginPage.open();
        loginPage.login("koeluser06@testpro.io", "wrongpassword");
        Assert.assertTrue(loginPage.isError());
    }

}
