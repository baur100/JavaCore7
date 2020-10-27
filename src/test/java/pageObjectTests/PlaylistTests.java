package pageObjectTests;

import helpers.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest{
    @Test
    public void playlistTest_CreatePlaylist_PlaylistCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        String playlistName = TestData.randomString(10);
        String playlistId = mainPage.createPlaylist(playlistName);
        boolean isCreated = mainPage.isPlaylistExist(playlistId, playlistName);

        Assert.assertTrue(isCreated);
    }

    @Test
    public void playlistTest_RenamePlaylist_PlaylistRenamed(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        String playlistName = TestData.randomString(10);
        String playlistId = mainPage.createPlaylist(playlistName);
        String newName = TestData.randomString(10);
        mainPage.renamePlaylist(playlistId,newName);
        boolean isExist = mainPage.isPlaylistExist(playlistId, newName);

        Assert.assertTrue(isExist);



    }

}
