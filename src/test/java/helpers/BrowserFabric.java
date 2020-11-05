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
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        options.addArguments("--width=1400");
        options.addArguments("--height=1000");
        System.setProperty("webdriver.gecko.driver","geckodriver");
        return new FirefoxDriver(options);
    }

    private static WebDriver getEdgeDriver() {
        System.setProperty("webdriver.edge.driver","msedgedriver.exe");
        return new EdgeDriver();
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("window-size=1400,1000");
        System.setProperty("webdriver.chrome.driver","chromedriver");
        return new ChromeDriver(options);
    }
}
