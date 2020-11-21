package helpers;

import static io.restassured.RestAssured.given;

public class ApiHelper {
    public static void deletePlaylist(String id,String token){
        given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/playlist/"+id)
                .header("Authorization",token)
                .when()
                .delete();
    }
}
