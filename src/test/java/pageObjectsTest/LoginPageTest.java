package pageObjectsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginPageTest extends BaseTest {
    @Test
    public void loginKoel_CorrectCredentials_SuccessfullyLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("muratj.tm@gmail.com","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginKoel_WrongCredentials_RedFrame() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("wrong@email.com", "wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
