package notesLesson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class notes6 {
    public class Login{
        private WebDriver driver;
        @BeforeMethod
        public void startUp(){
            System.setProperty("webdriver.chrome.driver","chromedriver.exe");
            driver = new ChromeDriver();
        }
        @AfterMethod
        public void tearDown()throws InterruptedException {
            Thread.sleep(5000);
            driver.close();
        }
        @Test
        public void loginToKoel_UsingCorrect (){
            wai
        }
    }
}
