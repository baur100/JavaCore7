package pageObjectTests;

import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class PlaylistTests extends BaseTest{
    @Test
    public void playlistTest_CreatePlaylist_PlaylistCreated(){
        LoginPage loginPage = new LoginPage(driver);
         loginPage.open();
       Main main = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        String playlistId = main.createPlaylist("testPlaylist");


    }

}
