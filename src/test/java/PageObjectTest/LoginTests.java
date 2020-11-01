package PageObjectTest;

import PageObject.LoginPage;
import PageObject.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;



    public class LoginTests extends BaseTest {

        @Test
        public void loginTest_correctCredentials_LoggedIn() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.open();
            MainPage mainpage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
            Assert.assertTrue(mainpage.isMAinPage());


        }

        @Test
        public void MainPage() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.open();
            MainPage mainpage = loginPage.login("koeluser06@testpro.io", "te$t$tudnt");
            Assert.assertTrue(mainpage.isMAinPage());

        }

        @Test
        public void loginTest_wrongCrredentialsLogin() {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.open();
            loginPage.login("koeluser06@testpro.io", "te$t$tudt");
            Assert.assertTrue(loginPage.isError());
        }
            @Test
            public void playListTest_CreatPlaylist_PLayListCreated() throws InterruptedException {
                LoginPage loginPage = new LoginPage(driver);
                loginPage.open();
                MainPage mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
                mainPage.createPlaylist("testPlaylist");

            }


    }