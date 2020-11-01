package helpers;

import org.apache.commons.lang3.RandomStringUtils;

public class TestData {
    public static String randomString(int stringLength) {
        return RandomStringUtils.random(stringLength, true, false);
    }
}
