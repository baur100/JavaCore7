package notes17Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://udemy.com");

        WebElement searchFiled = driver.findElement(By.cssSelector("[name='q']"));
        searchFiled.sendKeys("Java");
        searchFiled.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        WebElement searchResult = driver.findElement(By.cssSelector("h1"));
        String text = searchResult.getText();

        if (text.equals("10,000 results for 'java'")){
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            System.out.println("Actual value is = "+ text);
        }

        Thread.sleep(10000);
        driver.close();





    }
}
