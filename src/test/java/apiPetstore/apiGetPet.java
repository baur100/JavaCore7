package apiPetstore;

import helpers.PetStatus;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.Category;
import models.PetRequest;
import models.PetResponse;
import models.Tag;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class apiGetPet {
    @Test
    public void createPet_petCreated() {
        PetRequest petRequest = new PetRequest(
                248,
                new Category(0, "dog"),
                "Guffy",
                new String[]{"dog1.jpg", "dog2.jpg"},
                new Tag[]{new Tag(0, "dog")},
                PetStatus.pending);

        Response response = given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet")
                .header("Content-Type", "application/json")
                .body(petRequest)
            .when()
                .post()
            .then()
                .statusCode(200)
                .extract()
                .response();
    }
    @Test
    public void getPetReturnedById_petReturned() {
        Response response =
            given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/249")
            .when()
                .get()
            .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonData = response.jsonPath();

        PetResponse petResponse = jsonData.getObject("$",PetResponse.class);
        System.out.println(petResponse.getStatus());

        Assert.assertEquals(petResponse.getName(), "maymun");
        Assert.assertEquals(petResponse.getStatus(), PetStatus.available);
    }
}
