package koelLogin;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Login {
    private WebDriver driver;
    private WebDriverWait wait; // explicitly wait
    FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,10);
        fluentWait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .withMessage("Message");
    }
    @AfterMethod
    public void stopTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void koelLogin_CorrectCredentials_SuccessfullyLoggedIn() {
        // Arrange
        driver.get("https://koelapp.testpro.io");

//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[type=email]")));
        fluentWait.until(x->x.findElement(By.cssSelector("input[type=email]")).isDisplayed());
        WebElement emailField = driver.findElement(By.cssSelector("input[type=email]"));
        WebElement passwordField = driver.findElement(By.cssSelector("input[type=password]"));
        WebElement loginButton = driver.findElement(By.cssSelector("form>button"));

        // Act
        emailField.sendKeys("muratj.tm@gmail.com");
        passwordField.sendKeys("te$t$tudent");
        loginButton.click();

        // Assert
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.logout")));
        fluentWait.until(x->x.findElement(By.cssSelector("a.logout")).isDisplayed());
        WebElement logoutButton = driver.findElement(By.cssSelector("a.logout"));
        Assert.assertTrue(logoutButton.isDisplayed());

    }
    @Test
    public void loginKoel_WrongCredentials_RedFrame() {
        driver.get("https://koelapp.testpro.io");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type=email]")));
        WebElement emailField = driver.findElement(By.cssSelector("input[type=email]"));
        WebElement passwordField = driver.findElement(By.cssSelector("input[type=password]"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        emailField.sendKeys("muratj.tm@gmail.com");
        passwordField.sendKeys("qwerty");
        loginButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
        WebElement redFrame = driver.findElement(By.cssSelector(".error"));
        Assert.assertTrue(redFrame.isDisplayed());
    }
}
