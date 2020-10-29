package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFabric {
    public static WebDriver getDriver(Browser type) {
        switch (type) {
            default: return getChromeDriver();
            case FIREFOX: return getFirefoxDriver();
            case EDGE: return getEdgeDriver();
        }
    }

    private static WebDriver getEdgeDriver() {
        System.setProperty("webdriver.edge.driver", "msedgedriver");
        return new EdgeDriver();
    }

    private static WebDriver getFirefoxDriver() {
        return new FirefoxDriver();
    }

    private static WebDriver getChromeDriver() {
        return new ChromeDriver();
    }
}
