package pageObjectTests;

import helpers.TestData;
import listeners.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTestsA extends BaseTest{
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void playlistTestA_CreatePlaylist_PlaylistCreated() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        String playlistName = TestData.randomString(10);
        String playlistId = mainPage.createPlaylist(playlistName);
        boolean isCreated = mainPage.isPlaylistExist(playlistId, playlistName);

        Assert.assertTrue(isCreated);
    }

    @Test
    public void playlistTestA_RenamePlaylist_PlaylistRenamed(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        String playlistName = TestData.randomString(10);
        String playlistId = mainPage.createPlaylist(playlistName);
        String newName = TestData.randomString(10);
        mainPage.renamePlaylist(playlistId,newName);
        boolean isExist = mainPage.isPlaylistExist(playlistId, newName);

        Assert.assertTrue(isExist);
    }
    @Test
    public void playlistTestA_CreatePlaylist_PlaylistCreated1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        String playlistName = TestData.randomString(10);
        String playlistId = mainPage.createPlaylist(playlistName);
        boolean isCreated = mainPage.isPlaylistExist(playlistId, playlistName);

        Assert.assertTrue(isCreated);
    }

    @Test
    public void playlistTestA_RenamePlaylist_PlaylistRenamed1(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        String playlistName = TestData.randomString(10);
        String playlistId = mainPage.createPlaylist(playlistName);
        String newName = TestData.randomString(10);
        mainPage.renamePlaylist(playlistId,newName);
        boolean isExist = mainPage.isPlaylistExist(playlistId, newName);

        Assert.assertTrue(isExist);
    }
    @Test
    public void playlistTestA_CreatePlaylist_PlaylistCreated2() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        String playlistName = TestData.randomString(10);
        String playlistId = mainPage.createPlaylist(playlistName);
        boolean isCreated = mainPage.isPlaylistExist(playlistId, playlistName);

        Assert.assertTrue(isCreated);
    }

    @Test
    public void playlistTestA_RenamePlaylist_PlaylistRenamed2(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        String playlistName = TestData.randomString(10);
        String playlistId = mainPage.createPlaylist(playlistName);
        String newName = TestData.randomString(10);
        mainPage.renamePlaylist(playlistId,newName);
        boolean isExist = mainPage.isPlaylistExist(playlistId, newName);

        Assert.assertTrue(isExist);
    }
}
