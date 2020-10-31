package aePageObjectTests;

import aeListeners.RetryAnalyzer;
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
    int count=0;
    //@Test (retryAnalyzer = RetryAnalyzer.class)
    @Test
    public void loginToKoel_CorrectCredentials_SuccessfulLogin(){
        AELoginPage loginPage = new AELoginPage(driver);
        loginPage.open();
        AEMainPage mainPage = loginPage.login(username,password);
        Assert.assertTrue(mainPage.isMainPage());
        //Assert.assertEquals(count++,2);
    }
    @Test
    public void loginToKoel_IncorrectCredentials_ErrorFrame(){
        AELoginPage loginPage = new AELoginPage(driver);
        loginPage.open();
        loginPage.login(username, wrongPassword);
        Assert.assertTrue(loginPage.isError());
    }

}
