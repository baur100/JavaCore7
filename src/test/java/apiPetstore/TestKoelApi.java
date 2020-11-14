package apiPetstore;

import helpers.TestData;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.PlaylistCreateResponse;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestKoelApi {
    String token;
    String playlistId;
    @BeforeClass
    public void runOnce(){
        token = Token.get();
    }
    @BeforeMethod
    public void startUp(){
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
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist/"+playlistId)
                        .header("Authorization",token)
                        .delete();
    }
    @Test
    public void renamePlaylistAPIcall(){
        var newName = TestData.getPlaylistWithRandomName();
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/playlist/"+playlistId)
                        .header("Content-Type","application/json")
                        .header("Authorization",token)
                        .body(newName)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        var resp = jsonPath.getObject("$", PlaylistCreateResponse.class);
        Assert.assertEquals(newName.getName(),resp.getName());
        System.out.println(resp.getName());
    }
}
