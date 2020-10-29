package pageObjectTests;

import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTests extends BaseTest{
    int count=0;
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void loginTest_CorrectCredentials_LoggedIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        Assert.assertTrue(mainPage.isMainPage());
        Assert.assertEquals(count++,2);
    }
    @Test
    public void loginTest_WrongCredentials_ErrorFrameDisplayed() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(username,wrongPassword);
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTest_CorrectCredentials_LoggedIn1() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_WrongCredentials_ErrorFrameDisplayed1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(username,wrongPassword);
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTest_CorrectCredentials_LoggedIn2() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_WrongCredentials_ErrorFrameDisplayed2() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(username,wrongPassword);
        Assert.assertTrue(loginPage.isError());
    }
}
