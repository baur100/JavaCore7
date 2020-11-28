package gitHubGraphQlCall;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUser {
    @Test
    public void getUser(){
        String body = "{\"query\":\"query\\r\\n{\\r\\n    user(login:\\\"baur100\\\"){\\r\\n        name\\r\\n        location\\r\\n        bio\\r\\n    }\\r\\n}\",\"variables\":{\"username\":\"baur100\"}}";
        Response response =
                given()
                        .baseUri("https://api.github.com")
                        .basePath("/graphql")
                        .header("Content-Type","application/json")
                        .header("Authorization", "Bearer xxx")
                        .body(body)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        System.out.println(jsonPath.prettify());
    }
}
