package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    FluentWait<WebDriver> fluentWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementClickInterceptedException.class)
                .withMessage("Message");
    }

    public void setFluentWait(String css) {
        fluentWait.until(x->x.findElement(By.cssSelector(css)).isDisplayed());
    }

    public void explicitWait(String css) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
    }
    public void clickableWait(String css) {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(css)));
    }
}
