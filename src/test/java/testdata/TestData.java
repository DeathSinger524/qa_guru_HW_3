package testdata;

import com.github.javafaker.Faker;

import static utils.RandomUtils.*;

public class TestData {
    Faker faker = new Faker();

    public  String userName = faker.name().nameWithMiddle();
    public  String userEmail = faker.internet().emailAddress();
    public  String currentAddressInputData = faker.address().fullAddress();
    public  String permanentAddressInputData = faker.address().fullAddress();
    public  String currentAddressOutputData = "Current Address :" + currentAddressInputData;
    public  String permanentAddressOutputData = "Permananet Address :" + permanentAddressInputData;

    public static String emptyName = "Name:";
    public static String emptyEmail = "Email:";
    public static String emptyCurrentAddress = "Current Address :";
    public static String emptyPermanentAddress = "Permananet Address :";

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();

    public String state = getRandomState();
    public String city = getRandomCity(state);
    public String userNumber = getRandomPhone();
    public String gender = getRandomGender();
    public String imageName = getRandomImage();
    public String subject = getRandomSubject();
    public String hobbies = getHobbies();
    public String month = getRandomMonth();
    public String monthNumber = getMonthNumberByName(month);
    public String day = (String.valueOf(getRandomInt(1, 28)));
    public String year = (String.valueOf(getRandomInt(1975, 2026)));
    public String dateOfBirth = year + "-" + monthNumber + "-" +
            String.format("%02d", Integer.parseInt(day));
    public  String formErrorMessage = "Please fill required fields and enter a valid 10-digit mobile number.";
    public static String messageAfterSubmitting = "Thanks for submitting the form";
}
