package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://koelapp.testpro.io");
    }
    private WebElement getEmailField() {
        explicitWait("input[type=email]");
        return driver.findElement(By.cssSelector("input[type=email]"));
    }
    private WebElement getPasswordField() {
        return driver.findElement(By.cssSelector("input[type=password]"));
    }
    private WebElement getLoginButton() {
        return driver.findElement(By.cssSelector("button"));
    }
    private WebElement getErrorFrame() {
        explicitWait("form.error");
        return driver.findElement(By.cssSelector("form.error"));
    }

    public MainPage login(String email, String password) {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public boolean isError() {
        return getErrorFrame().isDisplayed();
    }
}
