package pageObjectsTests;

import helpers.BrowserFabric;
import helpers.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void startApp() {
        driver = BrowserFabric.getDriver(Browser.CHROME);

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    }
    @AfterMethod
    public void stopApp() throws InterruptedException {
//        Thread.sleep(500);
        driver.close();
    }
}
