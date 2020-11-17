package hybrid;

import com.github.javafaker.Faker;
import enums.BrowserType;
import helpers.BrowserFabric;
import helpers.TestData;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.PlaylistCreateResponse;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

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
        String newName = faker.funnyName().name();
        mainPage.renamePlaylist(playlistId,newName);
        boolean isExist = mainPage.isPlaylistExist(playlistId, newName);

        Assert.assertTrue(isExist);

    }
}
