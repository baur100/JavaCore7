package aePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.MainPage;

public class AELoginPage {
    private WebDriver driver;

    public AELoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getLoginEmail() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.cssSelector("[type ='email']"));
    }

    private WebElement getLoginPassword(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }

    private WebElement getLoginButton(){
        return driver.findElement(By.tagName("button"));
    }

    private WebElement getErrorFrame() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(By.cssSelector(".error"));
    }

    public void open() {
        driver.get("https://koelapp.testpro.io/");
    }

    public AEMainPage login(String email, String password) throws InterruptedException {
        getLoginEmail().sendKeys(email);
        getLoginPassword().sendKeys(password);
        getLoginButton().click();
        return new AEMainPage(driver);
    }

    public boolean isError() throws InterruptedException {
        return getErrorFrame().isDisplayed();
    }
}
