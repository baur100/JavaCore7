package PageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getLogOutButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa.fa-sign-out.control")));
        return driver.findElement(By.cssSelector(".fa.fa-sign-out.control"));
    }

    private WebElement getPlusButton() throws InterruptedException {
        Thread.sleep(3000);

        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    private WebElement getNewPlaylistField() {
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    private WebElement RenameList() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.xpath( "//a[contains(text(),'testPlaylist23']"));

}
    public boolean isMAinPage() {

        return getLogOutButton().isDisplayed();

    }

    public String  createPlaylist(String playlistName) throws InterruptedException {
        getPlusButton().click();
        getNewPlaylistField().sendKeys(playlistName);
        getNewPlaylistField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='success show']")));
        String url = driver.getCurrentUrl();
        return url.split("/")[5];




    }


    public boolean isPlaylistExist( String playlistId) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", playlist);
        return playlist.isDisplayed();

        Actions action = new Actions(driver);
        WebElement renameList = driver.findElement(By.xpath("//a[contains(text(),'testPlaylist23')]"));







        }


        
    }
