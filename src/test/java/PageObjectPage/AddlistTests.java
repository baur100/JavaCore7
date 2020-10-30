package PageObjectPage;

import org.testng.annotations.Test;
import pageObjects.LoginPage;



public class AddlistTests extends BaseTest{
            @Test
            public void playlistTest_CreatePlaylist_PlaylistCreated(){
                LoginPage loginPage = new LoginPage(driver);
                loginPage.open();
               Main mainPage  = loginPage.login("koeluser06@testpro.io","te$t$tudent");
      


            }

        }


