package aePageObjectTests;

import aeEnums.AEBrowserTypes;
import aehelpers.AEBrowserFabric;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AEBaseTest {
    protected WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void startUp(){
        driver = AEBrowserFabric.getDriver(AEBrowserTypes.CHROME);
        wait = new WebDriverWait(driver, 10);
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}
