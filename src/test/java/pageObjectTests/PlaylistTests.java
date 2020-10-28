package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest{
    @Test
    public void playlistTest_CreatePlaylist_PlaylistCreated(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist("testPlaylist1");
        boolean isCreated = mainPage.isPlaylistExist(playlistId);

        Assert.assertTrue(isCreated);
    }

}
