package apiPetstore;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class apiGetPet {
    @Test
    public void getPetById_petReturned(){
        Response response =
             given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/100")
             .when()
                .get()
             .then()
                .statusCode(200)
                .extract()
                .response();
        String res = response.asPrettyString();
        System.out.println(res);
        Assert.assertTrue(res.contains("pending"));

    }
}
