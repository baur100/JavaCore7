package HomeworkQATest.qaPages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private WebElement getLogoutButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa.fa-sign-out.control")));
        return driver.findElement(By.cssSelector(".fa.fa-sign-out.control"));
    }
    private WebElement getPlusButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }
    private WebElement getNewPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }
    public boolean isMainPage(){
        return getLogoutButton().isDisplayed();
    }

    private WebElement newTestPlaylist() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#playlists > h1 > i")));
        return driver.findElement(By.cssSelector("#playlists > h1 > i"));
    }

    private WebElement activePlaylist() {
        return driver.findElement(By.cssSelector(".playlist > input"));
    }

    private WebElement delTestPlaylist() {
        return driver.findElement(By.xpath("//button[@title='Delete this playlist']"));
    }


    public String createPlaylist(String playlistName) {
        newTestPlaylist().click();
        getNewPlaylistField().sendKeys(playlistName);
        getNewPlaylistField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        String url = driver.getCurrentUrl();
        return url.split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        return playlist.isDisplayed();
    }

    public String playlistRename(String playId) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playId+"']"));
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        Actions action = new Actions(driver);
        action.doubleClick(playlist).perform();
        // select the input that appears after double click action
        WebElement newP = activePlaylist();
        // edit the playlist name
        newP.sendKeys("edited" + Keys.ENTER);
        // get new playlist name after it appears
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='playlistWrapper']/h1/span")));
        String playlistName = driver.findElement(By.xpath("//*[@id='playlistWrapper']/h1/span")).getText();
        // delete playlist
        delTestPlaylist().click();
        return playlistName;
    }
}
