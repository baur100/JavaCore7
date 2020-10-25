package selenium1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

public class GoogleSearch {
    WebDriver driver;
    @BeforeMethod
    public void startApp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void stopApp() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test
    public void google_searchJAVA_getResults() {
        driver.get("https://google.com");

        WebElement searchField = driver.findElement(By.cssSelector("input[title=Search"));
        searchField.sendKeys("JAVA");
        searchField.sendKeys(Keys.ENTER);

        List<WebElement> results = driver.findElements(By.cssSelector("#rso>[class=g] a cite"));

        Assert.assertNotEquals(results.size(), 0);
    }
}
