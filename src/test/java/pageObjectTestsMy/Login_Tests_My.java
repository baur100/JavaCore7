package pageObjectTestsMy;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectsMy.LoginPageMy;

public class Login_Tests_My extends BaseTestMy {
    @Test
    public void RegisterButtonTest_WithoutClicking_Visible(){
        LoginPageMy loginPageMy = new LoginPageMy(driver);
        loginPageMy.open();
        Assert.assertTrue(loginPageMy.isDisplayed());
    }
}
