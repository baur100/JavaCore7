package hybrid;

import com.github.javafaker.Faker;
import enums.BrowserType;
import helpers.*;
import io.restassured.response.Response;
import models.Playlist;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

import static io.restassured.RestAssured.given;

public class renamePlaylistPlusDb {
    private String token;
    private String playlistId;
    private WebDriver driver;

    @BeforeClass
    public void runOnce(){
        token = Token.get();
    }
    @BeforeMethod
    public void startUp(){
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
        Faker faker = new Faker();
        String name = faker.beer().name();
        var playlistRequest = TestData.getPlaylistWithRandomName(name);
        System.out.println(name);
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist")
                        .header("Content-Type","application/json")
                        .header("Authorization",token)
                        .body(playlistRequest)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        playlistId = response.jsonPath().getInt("id")+"";
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
        ApiHelper.deletePlaylist(playlistId,token);
    }
    @Test
    public void renamePlaylist(){
        String newName = new Faker().funnyName().name();
        LoginPage page = new LoginPage(driver);
        page.open();
        MainPage mp = page.login("koeluser06@testpro.io","te$t$tudent");

        mp.renamePlaylist(playlistId, newName);
//        System.out.println(newName);
        Playlist fromDb = DbAdapter.getPlaylistById(playlistId);
        Assert.assertNotNull(fromDb);
        Assert.assertEquals(fromDb.getName(),newName);
    }
}
