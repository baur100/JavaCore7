package seleniumFirstStep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UdemyTest1 {
    private WebDriver driver;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown()throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
    @Test
    public void udemy_searchingJAVA_haveExplore() throws InterruptedException {
        // Arrange
        driver.get("https://udemy.com");

        // Act
        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        // Assert
        WebElement searchResult = driver.findElement(By.cssSelector("[data-purpose='safely-set-inner-html:related-topics:topic-name-link']"));

        String text = searchResult.getText();
        Assert.assertEquals(text,"Explore Java courses");
    }
    @Test
    public void udemy_searchingJAVA_have10000results() throws InterruptedException {
        // Arrange
        driver.get("https://udemy.com");

        // Act
        WebElement searchField = driver.findElement(By.xpath("//*[@name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        // Assert
        WebElement searchResult = driver.findElement(By.xpath("//h1"));

        String text = searchResult.getText();
        Assert.assertEquals(text,"10,000 results for “java”");
    }
}
