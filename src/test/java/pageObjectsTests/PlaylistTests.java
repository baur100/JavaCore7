package pageObjectsTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTests extends BaseTest {
    @Test
    public void playlistTest_CreatePlaylist_PlaylistCreated() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("muratj.tm@gmail.com", "te$t$tudent");
        boolean isCreated = mainPage.createPlaylist("TestNameForPlaylist");
        Assert.assertTrue(isCreated);
    }
    @Test
    public void playlistTest_RenamePlaylist_RenamedPlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("muratj.tm@gmail.com", "te$t$tudent");
        String playlistName = "test10";
        String newName = "test14";
        String renamedPlaylist = mainPage.renamePlaylist(playlistName, newName);

        Assert.assertEquals(newName, renamedPlaylist);
    }
}
