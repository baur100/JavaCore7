package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTestsA extends BaseTest{
    @Test
    public void loginTestA_CorrectCredentials_LoggedIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTestA_WrongCredentials_ErrorFrameDisplayed() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("koeluser06@testpro.io","wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTestA_CorrectCredentials_LoggedIn1() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTestA_WrongCredentials_ErrorFrameDisplayed1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("koeluser06@testpro.io","wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
    @Test
    public void loginTestA_CorrectCredentials_LoggedIn2() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTestA_WrongCredentials_ErrorFrameDisplayed2() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("koeluser06@testpro.io","wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
