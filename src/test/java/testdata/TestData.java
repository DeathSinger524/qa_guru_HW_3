package testdata;

import com.github.javafaker.Faker;

public class TestData {
    Faker faker = new Faker();

    public String userName = faker.name().nameWithMiddle();
    public  String userEmail = faker.internet().emailAddress();
    public  String currentAddressInputData = faker.address().fullAddress();
    public  String permanentAddressInputData = faker.address().fullAddress();
    public  String currentAddressOutputData = "Current Address :" + currentAddressInputData;
    public  String permanentAddressOutputData = "Permananet Address :" + permanentAddressInputData;

    public static String emptyName = "Name:";
    public static String emptyEmail = "Email:";
    public static String emptyCurrentAddress = "Current Address :";
    public static String emptyPermanentAddress = "Permananet Address :";

    public static String firstName = "John";
    public static String lastName = "Doe";
    public static String gender = "Male";
    public static String userNumber = "9999999999";
    public static String month = "March";
    public static String year = "1999";
    public static String subjectArt = "Arts";
    public static String subjectChemistry = "Chemistry";
    public static String hobbies = "Reading";
    public static String imageName = "img.png";
    public static String state = "Uttar Pradesh";
    public static String city = "Lucknow";
    public static String dateOfBirth = "1999-03-25";
    public static String formErrorMessage = "Please fill required fields and enter a valid 10-digit mobile number.";
    public static String messageAfterSubmitting = "Thanks for submitting the form";
    public static String dayOFBirth = "25";
}
