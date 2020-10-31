package aePageObjectTests;

import aePageObjects.AELoginPage;
import aePageObjects.AEMainPage;
import aehelpers.AETestData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AEPlaylistTests extends AEBaseTest{
    @Test
    public void playListTest_CreatePlaylist_PlaylistCreated() throws InterruptedException {
        AELoginPage loginPage = new AELoginPage(driver);
        loginPage.open();
        AEMainPage mainPage = loginPage.login(username,password);
        String playListName = AETestData.randomString(10);
        String playListId = mainPage.createPlaylist(playListName);
//        String playListId = mainPage.createPlaylist("testPaylistae");
        boolean isCreated = mainPage.isPlaylistExist(playListId, playListName);

        Assert.assertTrue(isCreated);
    }
    @Test
    public void playListTest_RenamePlaylist_PlaylistRenamed() throws InterruptedException {
        AELoginPage loginPage = new AELoginPage(driver);
        loginPage.open();
        AEMainPage mainPage = loginPage.login(username,password);
        String playListName = AETestData.randomString(10);
        String playListId = mainPage.createPlaylist(playListName);
        String newName = AETestData.randomString(10);
        mainPage.renamePlaylist(newName, playListId);
        boolean isExist = mainPage.isPlaylistExist(playListId, newName);

        Assert.assertTrue(isExist);
    }
}
