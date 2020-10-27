package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage1 {
    private WebDriver driver;

    public MainPage1(WebDriver driver) {
        this.driver = driver;
    }
    private WebElement getLogoutButton() throws InterruptedException {
        Thread.sleep(3000);
        return  driver.findElement(By.cssSelector(".fa.fa-sign-out.control"));
    }
    public boolean isMainPage() throws InterruptedException {
        return getLogoutButton().isDisplayed();
    }
}
