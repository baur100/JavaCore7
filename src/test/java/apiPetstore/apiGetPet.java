package apiPetstore;

import helpers.TestData;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.PetRequest;
import models.PetResponse;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class apiGetPet {
    private long petId;
    private PetRequest petRequest;

    @BeforeMethod
    public void startUp(){
        petRequest = TestData.getRandomPetRequest();
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .header("Content-Type","application/json")
                        .body(petRequest)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        petId = jsonPath.getLong("id");
    }
    @AfterMethod
    public void tearDown(){
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet/"+petId)
                        .when()
                        .delete()
                        .then();

    }
    @Test()
    public void getPetById_petReturned(){
        Response response =
             given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/"+petId)
             .when()
                .get()
             .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();

        PetResponse petResponse = jsonPath.getObject("$", PetResponse.class);
        Assert.assertEquals(petRequest.getName(),petResponse.getName(),"Pet names are not Equal");
        Assert.assertEquals(petRequest.getCategory().getName(),petResponse.getCategory().getName(), "Category names are not equal");
    }
    @Test
    public void updatePet(){
        PetRequest updatedPet = TestData.getRandomPetRequest();
        updatedPet.setId(petId);
        Response response =
                given()
                        .baseUri("https://petstore.swagger.io/v2")
                        .basePath("/pet")
                        .header("Content-Type","application/json")
                        .body(updatedPet)
                        .when()
                        .put()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        PetResponse petResponse = jsonPath.getObject("$", PetResponse.class);
        Assert.assertEquals(updatedPet.getName(),petResponse.getName());
    }
}
