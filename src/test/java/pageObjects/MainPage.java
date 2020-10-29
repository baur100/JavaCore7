package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    private WebElement getActivePlaylist() {
        explicitWait("#playlists .playlist a.active");
        return driver.findElement(By.cssSelector("#playlists .playlist a.active"));
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
        String[] playlistHref = getActivePlaylist().getAttribute("href").split("/");
        String playlistId = playlistHref[playlistHref.length-1];
        System.out.println(playlistId + " " + urlId);
        return urlId.equals(playlistId);
    }
}
