package aePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjects.MainPage;

public class AELoginPage extends AEBasePage{

    public AELoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getLoginEmail() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[type ='email']")));
        return driver.findElement(By.cssSelector("[type ='email']"));
    }

    private WebElement getLoginPassword(){
        return driver.findElement(By.xpath("//*[@type='password']"));
    }

    private WebElement getLoginButton(){
        return driver.findElement(By.tagName("button"));
    }

    private WebElement getErrorFrame(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".error")));
        return driver.findElement(By.cssSelector(".error"));
    }

    public void open() {
        driver.get("https://koelapp.testpro.io/");
    }

    public AEMainPage login(String email, String password){
        getLoginEmail().sendKeys(email);
        getLoginPassword().sendKeys(password);
        getLoginButton().click();
        return new AEMainPage(driver);
    }

    public boolean isError(){
        return getErrorFrame().isDisplayed();
    }
}
