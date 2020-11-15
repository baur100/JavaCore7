package helpers;

import com.github.javafaker.Faker;
import models.Category;
import models.PetRequest;
import models.Tag;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class TestData {
    public static String randomString(int stringLength) {
        return RandomStringUtils.random(stringLength, true, false);
    }

    public static PetRequest randomPetData() {
        Random rand = new Random();
        Faker fake = new Faker();
        Category category = new Category(rand.nextInt(99), fake.animal().name());
        String name = fake.pokemon().name();
        int photoUrlSize = rand.nextInt(4)+1;
        String[] photoUrl = new String[photoUrlSize];
        for(int i = 0; i < photoUrl.length; i++) {
            photoUrl[i] = fake.internet().image();
        }

        return new PetRequest(
                0,
                category,
                name,
                photoUrl,
                new Tag[]{},
                PetStatus.pending);
    }
}
