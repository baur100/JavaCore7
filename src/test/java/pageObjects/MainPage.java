package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getLogoutButton() {
        return driver.findElement(By.cssSelector("a.logout"));
    }

    public boolean isMainPage() {
        return getLogoutButton().isDisplayed();
    }
}
