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
    public void createPet() {
        petRequest = TestData.randomPetData();

        Response response = given().baseUri("https://petstore.swagger.io/v2").basePath("/pet")
                .header("Content-Type", "application/json").body(petRequest)
                .when().post()
                .then().statusCode(200)
                .extract().response();

        JsonPath jsonData = response.jsonPath();
        petId = jsonData.getLong("id");
        System.out.println("Created new pet with id: " + petId + " and name: " + petRequest.getName());
    }
    @AfterMethod
    public void deletePet() {
        given().baseUri("https://petstore.swagger.io/v2").basePath("/pet/" + petId)
                .when().delete()
                .then();

        System.out.println("Pet with id: " + petId + " was deleted successfully");
    }
    @Test
    public void getPetReturnedById_petReturned() {
        Response response =
                given().baseUri("https://petstore.swagger.io/v2").basePath("/pet/" + petId)
                        .when().get()
                        .then().statusCode(200)
                        .extract().response();

        JsonPath jsonData = response.jsonPath();
        PetResponse petResponse = jsonData.getObject("$",PetResponse.class);

        Assert.assertEquals(petResponse.getName(), petRequest.getName(), "Pet names aren't equal");
        Assert.assertEquals(petResponse.getCategory().getName(), petRequest.getCategory().getName(), "Categories aren't equal");
    }
    @Test
    public void updatePet_petUpdated() {
        PetRequest petUpdate = TestData.randomPetData();
        petUpdate.setId(petId);

        Response response =
                given().baseUri("https://petstore.swagger.io/v2").basePath("/pet")
                        .header("Content-Type","application/json")
                        .body(petUpdate)
                        .when().put()
                        .then().statusCode(200)
                        .extract().response();
        JsonPath jsonData = response.jsonPath();
        PetResponse petResponse = jsonData.getObject("$", PetResponse.class);

        Assert.assertEquals(petUpdate.getName(), petResponse.getName());

        System.out.println("Pet with id " + petId + " updated with name: " + petUpdate.getName());
    }
}
