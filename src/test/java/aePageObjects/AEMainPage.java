package aePageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AEMainPage extends AEBasePage{

    public AEMainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getLogoutButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".fa.fa-sign-out.control")));
        return driver.findElement(By.cssSelector(".fa.fa-sign-out.control"));
    }

    private WebElement getPlusButton() throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    private WebElement getNewPaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    private WebElement getRenamedPaylistField() throws InterruptedException {
        Thread.sleep(5000);
        return driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
    }

    public boolean isMainPage(){
        return getLogoutButton().isDisplayed();
    }

    public String createPlaylist(String testPlaylistName) throws InterruptedException {
        getPlusButton().click();
        getNewPaylistField().sendKeys(testPlaylistName);
        getNewPaylistField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        String url = driver.getCurrentUrl();
        //String[] parts = url.split("/");
        //System.out.println(parts[5]);
        return url.split("/")[5];
    }

    public boolean isPlaylistExist(String playListId, String playlistName) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playListId+ "']"));
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        return playlist.isDisplayed() && playlist.getText().equals(playlistName);


    }
    public void renamePlaylist(String testPlaylistNew_Name, String playListId ) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playListId+ "']"));
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        getRenamedPaylistField().clear();
        getRenamedPaylistField().sendKeys(Keys.BACK_SPACE);
        getRenamedPaylistField().sendKeys(testPlaylistNew_Name);
        getRenamedPaylistField().sendKeys(Keys.RETURN);

    }

}
