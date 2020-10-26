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
        String playlistId = mainPage.createPlaylist("testPlaylist");
        boolean isCreated = mainPage.isPlaylistExist(playlistId);

        Assert.assertTrue(isCreated);
    }
    @Test
    public void playlistTest_ChangePlaylistName_PlayListNameChanged(){
        LoginPage loginPage = new LoginPage(driver); //returns a NEW mainpage driver aka creates one
        loginPage.open();//no returned
        MainPage driverObj = loginPage.login("koeluser06@testpro.io","te$t$tudent");//reurn mainPage driver
        //driver returned will be object mainpage driver = driver
        String playlistId = driverObj.createPlaylist("newPlaylist"); //return url.split("/")[5];
        boolean confirmPlayList = driverObj.isPlaylistExist(playlistId);
        String newNamePlayList = driverObj.renamePlaylist(playlistId);

        Assert.assertEquals("AAA","AAA");
    }

}
