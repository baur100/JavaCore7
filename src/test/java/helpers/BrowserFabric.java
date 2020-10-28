package helpers;

import enums.BrowserType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFabric {
    public static WebDriver getDriver(BrowserType type) {
        switch (type){
            case CHROME: return getChromeDriver();
            case EDGE: return getEdgeDriver();
            default: return getFirefoxDriver();
        }
    }

    private static WebDriver getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver","geckodriver");
        return new FirefoxDriver();
    }

    private static WebDriver getEdgeDriver() {
        System.setProperty("webdriver.edge.driver","msedgedriver");
        return new EdgeDriver();
    }

    private static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        return new ChromeDriver();
    }
}
