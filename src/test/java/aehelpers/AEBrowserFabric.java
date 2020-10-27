package aehelpers;

import aeEnums.AEBrowserTypes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AEBrowserFabric {
    public static WebDriver getDriver(AEBrowserTypes type){
        switch(type){
            case CHROME: return getChromeDriver();
            case EDGE: return getEdgeDriver();
            default: return getFirefoxDriver();
        }
    }

    private static WebDriver getFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        return new FirefoxDriver();
    }

    private static WebDriver getEdgeDriver() {
        System.setProperty("webdriver.edge.driver","msedgedriver.exe");
        return new EdgeDriver();
    }

    private static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        return new ChromeDriver();
    }

}
