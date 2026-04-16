package utils;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.String.format;

public class RandomUtils {
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

    public static String getRandomSubject() {
        String[] subjects = {"Maths", "Physics", "Chemistry", "Biology", "English",
                "Computer Science", "Economics", "Arts", "History", "Civics"};
                return getRandomItemFromStringArray(subjects);
    }

    public static String getHobbies() {
        String[] genders = {"Sports", "Reading", "Music"};

        return getRandomItemFromStringArray(genders);
    }

    public static String getRandomImage() {
        String[] images = {"img_cat.png", "field_img.png", "home_img.jpg"};

        return getRandomItemFromStringArray(images);
    }

    public static String getRandomState() {
        String[] states = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"};

        return getRandomItemFromStringArray(states);
    }

public static String getRandomCity(String state) {
    switch (state) {
        case "NCR":
            return getRandomItemFromStringArray(new String[]{"Delhi", "Gurgaon", "Noida"});
        case "Uttar Pradesh":
            return getRandomItemFromStringArray(new String[]{"Agra", "Lucknow", "Merrut"});
        case "Haryana":
            return getRandomItemFromStringArray(new String[]{"Karnal", "Panipat"});
        case "Rajasthan":
            return getRandomItemFromStringArray(new String[]{"Jaipur", "Jaiselmer"});
        default:
            return state;
    }
}

    public static String getMonthNumberByName(String month) {
        for (Month m : Month.values()) {
            if (m.getDisplayName(TextStyle.FULL, Locale.ENGLISH).equals(month)) {
                return String.format("%02d", m.getValue());
            }
        }
        throw new IllegalArgumentException("Unknown month: " + month);
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
