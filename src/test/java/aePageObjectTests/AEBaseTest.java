package aePageObjectTests;

import aeEnums.AEBrowserTypes;
import aehelpers.AEBrowserFabric;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

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
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        driver.close();
    }
}
