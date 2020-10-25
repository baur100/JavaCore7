package koelSimple;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
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
    private WebDriverWait wait;
    private FluentWait<WebDriver> fluentWait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        fluentWait = new FluentWait<WebDriver>(driver)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Message");
//        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown()throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void loginToKoel_CorrectCredentials_SuccessfulLogin() throws InterruptedException {
        driver.get("https://koelapp.testpro.io/");

        fluentWait.until(x->x.findElement(By.cssSelector("[type='email']")).isDisplayed());

        WebElement loginEmail = driver.findElement(By.cssSelector("[type='email']"));
        WebElement loginPassword = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        loginEmail.sendKeys("koeluser06@testpro.io");
        loginPassword.sendKeys("te$t$tudent");
        loginButton.click();

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fa.fa-sign-out.control")));
        fluentWait.until(x->x.findElement(By.cssSelector(".fa.fa-sign-out.control")).isDisplayed());
        WebElement logoutButton = driver.findElement(By.cssSelector(".fa.fa-sign-out.control"));
        Assert.assertTrue(logoutButton.isDisplayed());


//        for (int i=0; i< 20; i++){
//            try{
//                driver.findElement(By.xpath("//*[@class='fa fa-sign-out control']"));
//                break;
//            } catch (NoSuchElementException xx){
//                Thread.sleep(500);
//            }
//            if (i==19){
//                throw new NoSuchElementException("Element not found");
//            }
//        }

    }

    @Test
    public void loginToKoel_WrongCredentials_RedFrame(){
        driver.get("https://koelapp.testpro.io/");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type='email']")));

        WebElement loginEmail = driver.findElement(By.cssSelector("[type='email']"));
        WebElement loginPassword = driver.findElement(By.xpath("//*[@type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button"));

        loginEmail.sendKeys("koeluser06@testpro.io");
        loginPassword.sendKeys("wrongPassword");
        loginButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".error")));
        WebElement redFrame = driver.findElement(By.cssSelector(".error"));
        Assert.assertTrue(redFrame.isDisplayed());
    }
}
