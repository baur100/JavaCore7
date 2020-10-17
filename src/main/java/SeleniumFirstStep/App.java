package SeleniumFirstStep;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://udemy.com");

        WebElement searchField = driver.findElement(By.cssSelector("[name='q']"));
        searchField.sendKeys("Java");
        searchField.sendKeys(Keys.ENTER);

        Thread.sleep(2000);

        WebElement searchResult = driver.findElement(By.cssSelector("[data-purpose='safely-set-inner-html:related-topics:topic-name-link']"));

        String text = searchResult.getText();
        System.out.println(text);

        if(text.equals("Explore Java courses"))       {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            System.out.println("Actual value is = "+text);
        }

        Thread.sleep(10000);
        driver.close();
    }

}
