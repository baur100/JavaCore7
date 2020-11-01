package pageObjectsTests;

import helpers.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest {
    @Test
    public void playlistTest_CreatePlaylist_PlaylistCreated() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        boolean isCreated = mainPage.createPlaylist(TestData.randomString(5));
        Assert.assertTrue(isCreated);
    }
    @Test
    public void playlistTest_RenamePlaylist_RenamedPlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username, password);
        String playlistName = TestData.randomString(5);
        mainPage.createPlaylist(playlistName);
        String newName = TestData.randomString(6);
        String renamedPlaylist = mainPage.renamePlaylist(playlistName, newName);

        Assert.assertEquals(newName, renamedPlaylist);
    }
}
