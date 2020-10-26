package HomeworkQATest;

import org.testng.Assert;
import org.testng.annotations.Test;
import HomeworkQATest.qaPages.LoginPage;
import HomeworkQATest.qaPages.MainPage;

public class PlaylistTests extends BaseTest {
    @Test
    public void playlistTest_CreatePlaylist_PlaylistCreated(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist("testPlaylist");
        boolean isCreated = mainPage.isPlaylistExist(playlistId);

        Assert.assertTrue(isCreated);
    }

    @Test
    public void playlistTest_Create_RenamePlaylist() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        String newPlaylist = "unipla1";
        String playlistId = mainPage.createPlaylist(newPlaylist);
        String changedName = mainPage.playlistRename(playlistId);
        System.out.println(newPlaylist);
        System.out.println(changedName);
        Assert.assertEquals("unipla1edited", changedName);
    }

}
