package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MainPage extends BasePage {
    Logger logger = LogManager.getLogger(MainPage.class);
    public MainPage(WebDriver driver) {
        super(driver);
        logger.debug("Main page created");
    }

    // element getters
    private WebElement getLogoutButton() {
        explicitWait("a.logout");
        return driver.findElement(By.cssSelector("a.logout"));
    }
    private void clickCreatePlaylistButton() {
        clickableWait("#playlists i.create");
        for (int i = 0;i<50; i++){
            try{
                driver.findElement(By.cssSelector("#playlists i.create")).click();
                logger.debug("button createPlaylist clicked");
                return;
            } catch (ElementClickInterceptedException ignoring){}
        }
    }
    private WebElement getCreatePlaylistInput() {
        clickableWait(".create input");
        return driver.findElement(By.cssSelector(".create input"));
    }
    private String getPlaylistId(WebElement playlist) {
        String playlistId;
        String[] href = playlist.getAttribute("href").split("/");
        playlistId = href[href.length-1];
        return playlistId;
    }
    private WebElement getPlaylistByName(String playlistName) {
        clickableWait("a[href*='playlist']");
        List<WebElement> playlists = driver.findElements(By.cssSelector("li.playlist a"));
        WebElement playlist = null;
        for (WebElement v : playlists) {
            if (playlistName.equals(v.getText())) {
                playlist = v;
            }
        }
        return playlist;
    }

    // methods
    public boolean isMainPage() {
        return getLogoutButton().isDisplayed();
    }

    public boolean createPlaylist(String playlistName) {
        clickCreatePlaylistButton();
        getCreatePlaylistInput().sendKeys(playlistName);
        getCreatePlaylistInput().sendKeys(Keys.ENTER);

        explicitWait("#playlists .playlist a.active");

        String[] url = driver.getCurrentUrl().split("/");
        String urlId = url[url.length-1];
        WebElement activePlaylist = driver.findElement(By.cssSelector("#playlists .playlist a.active"));
        String playlistId = getPlaylistId(activePlaylist);
        return urlId.equals(playlistId);
    }

//    public boolean playlistExist(String playlistName) {
//        boolean result = true;
//        if(getPlaylistByName(playlistName) == null)
//            result = false;
//        return result;
//    }

    public String renamePlaylist(String playlistName, String newNameForPlaylist) {
        Actions a = new Actions(driver);
        WebElement playlist = getPlaylistByName(playlistName);
        String playlistId = getPlaylistId(playlist);
        //renaming process
        a.moveToElement(playlist).doubleClick().perform();
        explicitWait(".playlist.editing");
        WebElement playlistNameInput = driver.findElement(By.cssSelector(".playlist.editing input"));
        playlistNameInput.sendKeys(Keys.chord(Keys.SHIFT, Keys.ARROW_UP));
        playlistNameInput.sendKeys(newNameForPlaylist);
        playlistNameInput.sendKeys(Keys.ENTER);
        //return new playlist name by id
        String renamedPlaylist = driver.findElement(By.cssSelector("a[href*='"+playlistId+"']")).getText();

        return renamedPlaylist;
    }
}
