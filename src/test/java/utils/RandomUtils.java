package utils;


import com.github.javafaker.Faker;
import pages.TextBoxPage;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.String.format;

public class RandomUtils {
    static Faker faker = new Faker();

    public static void main(String[] args) {
        //System.out.println(getRandomGender());
        //System.out.println(getRandomPhone());
        System.out.println(getRandomMonth());
        System.out.println(getRandomInt(1, 28));
    }



    public static int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};

        return getRandomItemFromStringArray(genders);
    }

    public static String getRandomMonth() {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return getRandomItemFromStringArray(months);
    }

    public static String getRandomItemFromStringArray(String[] stringArray) {
        int arrayLength = stringArray.length;
        int randomIndex = getRandomInt(0, arrayLength - 1);

        return stringArray[randomIndex];
    }

    public static String getRandomPhone() {
        String phoneTemplate = "%s%s%s%s%s";

        return format(phoneTemplate, getRandomInt(1, 9), getRandomInt(111, 999), getRandomInt(111, 999)
                , getRandomInt(11, 99), getRandomInt(1, 9));
    }
}
