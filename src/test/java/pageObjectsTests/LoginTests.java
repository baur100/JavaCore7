package pageObjectsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTests extends BaseTest {
    @Test
    public void loginTest_CorrectCredentials_SuccessfullyLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test(enabled = false)
    public void loginTest_WrongCredentials_RedFrame() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login(username, "wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
