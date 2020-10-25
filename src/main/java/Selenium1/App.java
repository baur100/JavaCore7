package Selenium1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        String searchFor = input.nextLine();

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("https://google.com");

        WebElement searchField = driver.findElement(By.cssSelector("input[title=Search]"));
        searchField.sendKeys(searchFor);
        searchField.sendKeys(Keys.ENTER);

        List<WebElement> results = driver.findElements(By.cssSelector("#rso>[class=g] a cite"));
        for (WebElement v : results) {
            String text = v.getText();
            int fistSpace = text.indexOf(" ");

            if (fistSpace > 0) {
                int i = fistSpace;
                System.out.println(text.substring(0, i));
            } else {
                System.out.println(text);
            }
        }

        if (results.size() > 0) {
            System.out.println("Found " + results.size() + " results");
        } else {
            System.out.println("Nothing found");
        }

        Thread.sleep(5000);

        driver.close();
    }
}
