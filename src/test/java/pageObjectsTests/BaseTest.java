package pageObjectsTests;

import helpers.BrowserFabric;
import helpers.Browser;
import helpers.Screenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.text.SimpleDateFormat;
import java.util.Date;
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
    public void stopApp(ITestResult iTestResult) {
        if (iTestResult.getStatus() == iTestResult.FAILURE){
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("_MM-dd-yyyy-HH:mm:ss");
            String fileName = iTestResult.getName()+formatter.format(date);
            Screenshot.get(driver, fileName);
        }
        driver.quit();
    }
}
