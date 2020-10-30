package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
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


    public String createPlaylist(String playlistName) {
        getPlusButton().click();
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

}
