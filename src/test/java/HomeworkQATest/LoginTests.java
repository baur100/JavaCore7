package HomeworkQATest;

import org.testng.Assert;
import org.testng.annotations.Test;
import HomeworkQATest.qaPages.LoginPage;
import HomeworkQATest.qaPages.MainPage;

public class LoginTests extends BaseTest {
    @Test
    public void loginTest_CorrectCredentials_LoggedIn() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginTest_WrongCredentials_ErrorFrameDisplayed() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("koeluser06@testpro.io","wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
