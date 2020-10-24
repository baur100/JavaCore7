package aePageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AEMainPage extends AEBasePage{

    public AEMainPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getLogoutButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".fa.fa-sign-out.control")));
        return driver.findElement(By.cssSelector(".fa.fa-sign-out.control"));
    }

    private WebElement getPlusButton(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='fa fa-plus-circle control create']")));
        return driver.findElement(By.xpath("//*[@class='fa fa-plus-circle control create']"));
    }

    private WebElement getNewPaylistField(){
        return driver.findElement(By.xpath("//*[@class='create']/input"));
    }

    public boolean isMainPage(){
        return getLogoutButton().isDisplayed();
    }

    public String createPlaylist(String testPaylistName) {
        getPlusButton().click();
        getNewPaylistField().sendKeys(testPaylistName);
        getNewPaylistField().sendKeys(Keys.RETURN);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='success show']")));
        String url = driver.getCurrentUrl();
//        String[] parts = url.split("/");
//        System.out.println(parts[5]);
        return url.split("/")[5];
    }

    public boolean isPlaylistExist(String playListId) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

    }
}
