package apiKoel;

import helpers.TestData;
import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.PlaylistCreateReq;
import models.PlaylistRes;
import org.testng.annotations.*;

import static io.restassured.RestAssured.given;

public class TestKoelApi {
    String token;
    String url = "https://koelapp.testpro.io/api/";
    int playlistId;

    @BeforeClass
    public void login(){
        token = Token.get(url, "me", "muratj.tm@gmail.com", "te$t$tudent");
        System.out.println("Logged in, a token is ready");
    }
    @AfterClass
    public void logout() {
        Token.delete(url, "me", token);
        System.out.println("Logged out the token deleted");
    }
    @BeforeMethod
    public void createPlaylist(){
        var body = TestData.randomPlaylistName();
        Response response = given().baseUri(url).basePath("playlist/")
                .header("Authorization", token)
                .header("Content-Type", "application/json")
                .body(body)
                .when().post()
                .then().statusCode(200)
                .extract().response();
        JsonPath jsonData = response.jsonPath();
        var res = jsonData.getObject("$", PlaylistRes.class);
        playlistId = res.getId();
        System.out.println("Created playlist: "+res.getName());
    }
    @AfterMethod
    public void deletePlaylist() {
        given().baseUri(url).basePath("playlist/" + playlistId)
                .header("Authorization", token)
                .delete();
    }

    @Test
    public void renamePlaylist() {
        PlaylistCreateReq body = TestData.randomPlaylistName();
        Response response = given().baseUri(url).basePath("playlist/" + playlistId)
                .header("Authorization", token)
                .header("Content-Type", "application/json")
                .body(body)
                .when().put()
                .then().statusCode(200)
                .extract().response();
        JsonPath jsonData = response.jsonPath();
        var res = jsonData.getObject("$", PlaylistRes.class);
        System.out.println("Renamed playlist: "+res.getName());
    }
}
