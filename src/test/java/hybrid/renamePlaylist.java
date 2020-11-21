package hybrid;

import com.github.javafaker.Faker;
import enums.BrowserType;
import helpers.BrowserFabric;
import helpers.TestData;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.PlaylistCreateResponse;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import static io.restassured.RestAssured.given;

public class renamePlaylist {
    private String token;
    private String playlistId;
    protected WebDriver driver;
    @BeforeClass
    public void runOnce(){
        token = Token.get();
    }
    @BeforeMethod
    public void startUp(){
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
        var body = TestData.getPlaylistWithRandomName();
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist")
                        .header("Content-Type","application/json")
                        .header("Authorization",token)
                        .body(body)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        var resp = jsonPath.getObject("$", PlaylistCreateResponse.class);
        playlistId = resp.getId()+"";
        System.out.println(body.getName());
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
        given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+playlistId)
                .header("Authorization",token)
                .delete();
    }
    @Test
    public void renamePlaylist_PlaylistRenamed(){
        Faker faker = new Faker();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login("koeluser06@testpro.io","te$t$tudent");
        Set<Cookie> set = driver.manage().getCookies();
        String newName = faker.funnyName().name();
        mainPage.renamePlaylist(playlistId,newName);
        boolean isExist = mainPage.isPlaylistExist(playlistId, newName);

        Assert.assertTrue(isExist);
    }
    @Test
    public void testLoginlessLogin(){
//        // get a calendar instance, which defaults to "now"
//        Calendar calendar = Calendar.getInstance();
//
//        // get a date to represent "today"
//        Date today = calendar.getTime();
//        System.out.println("today:    " + today);
//
//        // add one day to the date/calendar
//        calendar.add(Calendar.DAY_OF_YEAR, 1);
//
//        // now get "tomorrow"
//        Date tomorrow = calendar.getTime();
//        Map<String,String> cookiesMap = Token.getCookies();
//        Cookie cookies = new Cookie("__cfduid",cookiesMap.get("__cfduid"),"koelapp.testpro.io","/",tomorrow,false,true);

        LocalStorage local = ((WebStorage) driver).getLocalStorage();
        local.setItem("jwt-token", Token.getCookies());
        driver.get("https://koelapp.testpro.io");

    }
}
