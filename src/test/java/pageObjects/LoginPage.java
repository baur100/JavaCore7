package pageObjects;

import org.openqa.selenium.*;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://koelapp.testpro.io");
    }
    private WebElement getEmailField() {
        return driver.findElement(By.cssSelector("input[type=email]"));
    }
    private WebElement getPasswordField() {
        return driver.findElement(By.cssSelector("input[type=password]"));
    }
    private WebElement getLoginButton() {
        return driver.findElement(By.cssSelector("button"));
    }
    private WebElement getErrorFrame() {
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
