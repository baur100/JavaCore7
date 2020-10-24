package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getEmailField() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.cssSelector("[type='email']"));
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("button"));
    }

    private WebElement getErrorFrame() throws InterruptedException {
        Thread.sleep(1000);
        return driver.findElement(By.cssSelector(".error"));
    }

    public void open(){
        driver.get("https://koelapp.testpro.io/");
    }

    public MainPage login(String email, String password) throws InterruptedException {
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public boolean isError() throws InterruptedException {
        return getErrorFrame().isDisplayed();
    }
}
