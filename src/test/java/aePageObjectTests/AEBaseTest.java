package aePageObjectTests;

import aeEnums.AEBrowserTypes;
import aehelpers.AEBrowserFabric;
import aehelpers.AEScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AEBaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String wrongPassword;

    @Parameters({"email", "password"})

    @BeforeMethod
    public void startUp(String login, String password){
        username = login;
        this.password = password;
        wrongPassword = "wrongpassword";
        driver = AEBrowserFabric.getDriver(AEBrowserTypes.CHROME);

    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult) {
        if(iTestResult.getStatus() == iTestResult.FAILURE){
            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyyHHmmss");
            //System.out.println(formatter.format(date));
            String filename = iTestResult.getName() + formatter.format(date);
            AEScreenshot.get(driver, filename);
        }
        driver.close();
    }
}
