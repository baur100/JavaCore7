package apiPetstore;

import helpers.Token;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.DataResponse;
import models.Playlist;
import models.PlaylistCreateResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PurgeKoelPlaylist {
    @Test
    public void purgePlaylists(){
        String token = Token.get();
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/data")
                        .header("Authorization",token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        var resp = jsonPath.getObject("$", DataResponse.class);
        var playlists = resp.getPlaylists();
        for (Playlist p : playlists){
            given()
                    .baseUri("https://koelapp.testpro.io/")
                    .basePath("api/playlist/"+p.getId())
                    .header("Authorization",token)
                    .delete();
        }
    }
}
