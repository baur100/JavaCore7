package aePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class aeLoginPage {
    private WebDriver driver;

    public aeLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getErrorFrame(){
        return driver.findElement(By.cssSelector(".error"));
    }
}
