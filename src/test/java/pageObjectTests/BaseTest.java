package pageObjectTests;

import enums.BrowserType;
import helpers.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    protected String wrongPassword;

    @Parameters({"email","password"})
    @BeforeMethod
    public void startUp(String login, String password){
        username = login;
        this.password = password;
        wrongPassword = "wrongPassword";
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
