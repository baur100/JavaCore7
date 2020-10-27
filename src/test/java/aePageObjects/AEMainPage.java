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

    private void clickPlusButton() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        //Thread.sleep(5000);
        //fluentWait.until(x->x.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")).isDisplayed());

        for (int i = 0; i < 50; i++) {
            try {
                driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']")).click();
                return;
            } catch (ElementClickInterceptedException ignoring){

            }
    }
        throw new ElementClickInterceptedException("Element not reachable");
    }

    private WebElement getNewPaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    private WebElement getRenamedPaylistField(){
        return driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
    }

    public boolean isMainPage(){
        return getLogoutButton().isDisplayed();
    }

    public String createPlaylist(String testPlaylistName){
        clickPlusButton();
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
    public void renamePlaylist(String testPlaylistNew_Name, String playListId){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/" + playListId+ "']"));
        js.executeScript("arguments[0].scrollIntoView();", playlist);
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        getRenamedPaylistField().sendKeys(Keys.CONTROL+"a");
        getRenamedPaylistField().sendKeys(testPlaylistNew_Name);
        getRenamedPaylistField().sendKeys(Keys.RETURN);

    }

}
