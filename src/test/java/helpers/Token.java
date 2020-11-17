package helpers;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Credentials;

import static io.restassured.RestAssured.given;

public class Token {
    // this method should work for any API
    public static String get(String url, String path, String email, String password) {
        Credentials credentials = new Credentials(email, password);

        Response response = given().baseUri(url).basePath(path)
                .header("Content-Type", "application/json")
                .body(credentials)
                .when().post()
                .then().statusCode(200)
                .extract().response();
        JsonPath jsonData = response.jsonPath();
        return "Bearer " + jsonData.getString("token");
    }
    public static void delete(String url, String path, String token){
        given().baseUri(url).basePath(path)
                .header("Authorization", token)
                .delete();
    }
}
