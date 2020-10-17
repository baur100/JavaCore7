package aeSeleniumFirstStep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.udemy.com/");

        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        WebElement searchResult = driver.findElement(By.cssSelector("[data-purpose='safely-set-inner-html:related-topics:topic-name-link']"));

        String text = searchResult.getText();
        System.out.println(text);


        Thread.sleep(5000);
        driver.close();
    }
}
