package helpers;

import io.restassured.http.Cookie;
import io.restassured.http.Cookies;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Credentials;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class Token {
    public static String get(){
        Credentials credentials = new Credentials("koeluser06@testpro.io","te$t$tudent");
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/me")
                        .header("Content-Type","application/json")
                        .body(credentials)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        return "Bearer "+jsonPath.getString("token");
    }
    public static String getCookies(){
        Credentials credentials = new Credentials("koeluser06@testpro.io","te$t$tudent");
        Response response =
                given()
                        .baseUri("https://koelapp.testpro.io/")
                        .basePath("api/me")
                        .header("Content-Type","application/json")
                        .body(credentials)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        return "Bearer "+jsonPath.getString("token");
    }
}
