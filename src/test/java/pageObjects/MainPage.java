package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }
    private WebElement getLogoutButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa.fa-sign-out.control")));
        return driver.findElement(By.cssSelector(".fa.fa-sign-out.control"));
    }
    private void clickPlusButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-plus-circle control create']")));
//        fluentWait.until(x->x.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")));

        for (int i = 0;i<50; i++){
            try{
                driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")).click();
                return;
            } catch (ElementClickInterceptedException ignoring){

            }
        }
        throw new ElementClickInterceptedException("Element not reachable");
    }
    private WebElement getPlaylistEditField(){
        return driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
    }
    private WebElement getNewPlaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }
    public boolean isMainPage(){
        return getLogoutButton().isDisplayed();
    }


    public String createPlaylist(String playlistName) {
        clickPlusButton();
        getNewPlaylistField().sendKeys(playlistName);
        getNewPlaylistField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        String url = driver.getCurrentUrl();
        return url.split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId, String playlistName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        return playlist.isDisplayed() && playlist.getText().equals(playlistName);
    }

    public void renamePlaylist(String playlistId, String newName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        getPlaylistEditField().sendKeys(Keys.COMMAND+"a");
        getPlaylistEditField().sendKeys(newName);
        getPlaylistEditField().sendKeys(Keys.RETURN);
    }
}
