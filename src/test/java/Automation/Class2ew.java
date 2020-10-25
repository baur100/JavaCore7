package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class2ew {

    @Test

    public void google_searchingTajikistanWord(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.findElement(By.name("q")).sendKeys("Tajikistan");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);




        String text = driver.findElement(By.cssSelector("h1")).getText();

        Assert.assertEquals(text,"Uzbekistan");

    }



}
