package helpers;

import com.github.javafaker.Faker;
import enums.PetStatus;
import models.Category;
import models.PetRequest;
import models.PlaylistCreateRequest;
import models.Tag;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestData {
    public static String randomString(int length){
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers);
    }
    public static PetRequest getRandomPetRequest(){
        Faker faker = new Faker();
        Random random = new Random();
        String name = faker.cat().name();
        Category category = new Category(faker.cat().breed(),random.nextInt(21));
        int photoUrlSize = random.nextInt(4)+1;
        String[]photoUrl = new String[photoUrlSize];
        for (int i = 0; i< photoUrlSize;i++){
            photoUrl[i] = faker.internet().image();
        }
        Tag[] tags = {new Tag(random.nextInt(21),faker.animal().name())};
        PetStatus status = PetStatus.available;

        return new PetRequest(0,category,name,photoUrl,tags,status);
    }

    public static PlaylistCreateRequest getPlaylistWithRandomName(){
        Faker faker = new Faker();
        return new PlaylistCreateRequest(faker.artist().name());
    }
    public static PlaylistCreateRequest getPlaylistWithRandomName(String name){
        return new PlaylistCreateRequest(name);
    }
}
