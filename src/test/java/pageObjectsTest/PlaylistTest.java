package pageObjectsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class PlaylistTest extends BaseTest {
    @Test
    public void playlist_CreatePlaylist_PlaylistCreated() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("muratj.tm@gmail.com", "te$t$tudent");
        boolean isCreated = mainPage.createPlaylist("TestNameForPlaylist");
        Assert.assertTrue(isCreated);
    }
    @Test
    public void playlist_RenamePlaylist_RenamedPlaylist() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("muratj.tm@gmail.com", "te$t$tudent");
        String playlistName = "TestNameForPlaylist";
        String newName = "test8";
        String renamedPlaylist = mainPage.renamePlaylist(playlistName, newName);

        Assert.assertTrue(renamedPlaylist.equals(newName));
    }
}
