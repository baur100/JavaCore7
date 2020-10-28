package pageObjectsMy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageMy extends BasePageMy {
    public LoginPageMy(WebDriver driver) { super(driver);}

    private WebElement getRegisterbutton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Register']")));
        return driver.findElement(By.xpath("//*[text()='Register']"));
    }
    public  void open() {driver.get("https://koelapp.testpro.io/");}

    public  boolean isDisplayed() {return getRegisterbutton().isDisplayed();
    }


}
