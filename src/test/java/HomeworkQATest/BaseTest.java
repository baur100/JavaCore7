package HomeworkQATest;

import enums.BrowserType;
import helpers.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    @BeforeMethod
    public void startUp(){
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
    }
    @AfterMethod
    public void tearDown()throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
