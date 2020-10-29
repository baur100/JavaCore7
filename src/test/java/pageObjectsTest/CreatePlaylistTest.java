package pageObjectsTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class CreatePlaylistTest extends BaseTest {
    @Test
    public void playlist_CreatePlaylist_PlaylistCreated() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("muratj.tm@gmail.com", "te$t$tudent");
        boolean isCreated = mainPage.createPlaylist("TestNameForPlaylist");
        Assert.assertTrue(isCreated);
    }
}
