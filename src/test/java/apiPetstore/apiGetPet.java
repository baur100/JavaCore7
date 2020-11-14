package apiPetstore;

import enums.PetStatus;
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
    public void getPetById_petReturned(){
        Response response =
             given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/1001")
             .when()
                .get()
             .then()
                .statusCode(200)
                .extract()
                .response();
        JsonPath jsonPath = response.jsonPath();

        PetResponse petResponse = jsonPath.getObject("$", PetResponse.class);
        Assert.assertEquals(petResponse.getName(),"Lessi");
        Assert.assertEquals(PetStatus.available,petResponse.getStatus());
//        String petName = jsonPath.getString("name");
//        Assert.assertEquals(petName,"Lessi");
        Assert.assertEquals("dogs",petResponse.getCategory().getName());


    }

    @Test
    public void createPet_petCreated(){
        PetRequest petRequest =
                new PetRequest(1002,
                new Category("Rats",444),"Ratatui",
                new String[]{},new Tag[]{},PetStatus.sold);
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
//        JsonPath jsonPath = response.jsonPath();
    }
}
