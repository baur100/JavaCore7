package hSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Work {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://udemy.com");

        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        WebElement searchResult = driver.findElement(By.cssSelector("h1"));
        String text = searchResult.getText();

        if (text.equals("1,000 results for “java”")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
            System.out.println("Actual value is = "+ text);
        }


        Thread.sleep(10000);
        driver.close();

    }
}
