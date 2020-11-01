package PageObjectTest;

import PageObject.LoginPage;
import PageObject.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class PlaylistTest extends BaseTest {
        @Test
    public void playListTest_CreatPlaylist_PLayListCreated() throws InterruptedException {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.open();
            MainPage mainPage = loginPage.login("koeluser06@testpro.io", "te$t$tudent");
           String playlistId =  mainPage.createPlaylist("testPlaylist23");
           boolean isCreated = mainPage.isPlaylistExist(playlistId);
           Assert.assertTrue(isCreated);
           
        }



    }



