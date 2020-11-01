package pageObjectsTests;

import helpers.BrowserFabric;
import helpers.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;

    @Parameters({"email", "password"})
    @BeforeMethod
    public void startApp(String username, String password) {
        driver = BrowserFabric.getDriver(Browser.CHROME);
        this.username = username;
        this.password = password;
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void stopApp() throws InterruptedException {
//        Thread.sleep(500);
        driver.close();
    }
}
