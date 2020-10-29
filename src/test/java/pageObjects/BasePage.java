package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void explicitWait(String css) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
    }
    public void clickableWait(String css) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
    }
}
