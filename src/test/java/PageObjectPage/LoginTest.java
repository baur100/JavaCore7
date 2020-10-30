package PageObjectPage;


import org.testng.Assert;

import org.testng.annotations.Test;
import pageObjects.LoginPage;


public class LoginTest extends BaseTest {


    @Test
    public void LoginTest_correctCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
       Main main =  loginPage.login("koeluser06@testpro.io","te$t$tudent");
     
    }
    @Test
    public void LoginTest_wrongCredentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("koeluser06@testpro.io","te$t$tuden");
        Assert.assertTrue(loginPage.isError());
}      }