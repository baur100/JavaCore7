package HomeworkQATest.qaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getEmailField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type='email']")));
        return driver.findElement(By.cssSelector("[type='email']"));
    }
    private WebElement getPasswordField(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }
    private WebElement getLoginButton(){
        return driver.findElement(By.cssSelector("button"));
    }

    private WebElement getErrorFrame() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error")));
        return driver.findElement(By.cssSelector(".error"));
    }

    public void open(){
        driver.get("https://koelapp.testpro.io/");
    }

    public MainPage login(String email, String password){
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);
    }
    public boolean isError() {
        return getErrorFrame().isDisplayed();
    }
}
