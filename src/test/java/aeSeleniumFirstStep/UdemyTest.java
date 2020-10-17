package aeSeleniumFirstStep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UdemyTest {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();
    }
    @Test
    public void udemy_searchingJava_have1000results() throws InterruptedException {
        //Arrange

        driver.get("https://www.udemy.com/");

        //Act
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(5000);

        //Assert
        WebElement searchResult = driver.findElement(By.cssSelector("h1"));

        String text = searchResult.getText();

        Assert.assertEquals(text, "10,000 results for “java”");

    }

}
