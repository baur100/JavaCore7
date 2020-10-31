package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    // element getters
    private WebElement getLogoutButton() {
        explicitWait("a.logout");
        return driver.findElement(By.cssSelector("a.logout"));
    }
    private WebElement getCreatePlaylistButton() {
        clickableWait("#playlists i.create");
        return driver.findElement(By.cssSelector("#playlists i.create"));
    }
    private WebElement getCreatePlaylistInput() {
        explicitWait(".create input");
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
        getCreatePlaylistButton().click();
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
