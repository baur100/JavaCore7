package pageObjectsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    WebDriver driver;
    @BeforeMethod
    public void startApp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void stopApp() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }
    @Test
    public void loginKoel_CorrectCredentials_SuccessfullyLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("muratj.tm@gmail.com","te$t$tudent");
        Assert.assertTrue(mainPage.isMainPage());
    }
    @Test
    public void loginKoel_WrongCredentials_RedFrame() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.login("wrong@email.com", "wrongPassword");
        Assert.assertTrue(loginPage.isError());
    }
}
