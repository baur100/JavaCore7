package aePageObjectTests;

import aePageObjects.AELoginPage;
import aePageObjects.AEMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AEPlaylistTests extends AEBaseTest{
    @Test
    public void playListTest_CreatePlaylist_PlaylistCreated(){
        AELoginPage loginPage = new AELoginPage(driver);
        loginPage.open();
        AEMainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        String playListId = mainPage.createPlaylist("testPaylist");
        boolean isCreated = mainPage.isPlaylistExist(playListId);

        Assert.assertTrue(isCreated);

    }
}
