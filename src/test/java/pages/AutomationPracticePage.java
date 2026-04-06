package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import text.box.tests.BaseTest;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticePage extends BaseTest {
    //Elements
    String automationPracticeUrl = "/one-page-form/automation-practice-form.html";

    private final SelenideElement closeCoursesButton = $("#fixedban").$("button[aria-label='Close']");
    private final SelenideElement firstName = $("#firstName");
    private final SelenideElement lastName = $("#lastName");
    private final SelenideElement userEmail = $("#userEmail");
    private final SelenideElement genderContainer = $("#genterWrapper");
    private final SelenideElement userNumber = $("#userNumber");
    private final SelenideElement dateOfBirthInput = $("#dateOfBirthInput");
    private final SelenideElement datepickerMonth = $("select.react-datepicker__month-select");
    private final SelenideElement datepickerYear = $("select.react-datepicker__year-select");
    private final SelenideElement subjects = $("#subjectsInput");
    private final SelenideElement hobbies = $("#hobbiesWrapper");
    private final SelenideElement uploadPicture = $("#uploadPicture");
    private final SelenideElement currentAddress = $("#currentAddress");
    private final SelenideElement state = $("#state");
    private final SelenideElement stateCityWrapper = $("#stateCity-wrapper");
    private final SelenideElement city = $("#city");
    private final SelenideElement submitButton = $("#submit");

    private final SelenideElement modalTitleWindow = $("#example-modal-sizes-title-lg");
    private final SelenideElement studentName = $(".table-responsive").$(byText("Student Name")).parent();
    private final SelenideElement studentEmail = $(".table-responsive").$(byText("Student Email")).parent();
    private final SelenideElement studentGender = $(".table-responsive").$(byText("Gender")).parent();
    private final SelenideElement studentMobile = $(".table-responsive").$(byText("Mobile")).parent();
    private final SelenideElement studentDateOfBirth = $(".table-responsive").$(byText("Date of Birth")).parent();
    private final SelenideElement studentSubjects = $(".table-responsive").$(byText("Subjects")).parent();
    private final SelenideElement studentHobbies= $(".table-responsive").$(byText("Hobbies")).parent();
    private final SelenideElement studentPicture = $(".table-responsive").$(byText("Picture")).parent();
    private final SelenideElement studentAddress = $(".table-responsive").$(byText("Address")).parent();
    private final SelenideElement studentStateAndCity = $(".table-responsive").$(byText("State and City")).parent();
    private final SelenideElement modalWindow = $("#closeModal");

    private final SelenideElement formError = $("#formError");

    //Actions
    public AutomationPracticePage openPage(){
        open(automationPracticeUrl);
        return this;
    }

    public AutomationPracticePage closeCoursesWindow(){
        closeCoursesButton.click();
        return this;
    }

    public AutomationPracticePage typeFirstName(String value){
        firstName.setValue(value);
        return this;
    }

    public AutomationPracticePage typeLastName(String value){
        lastName.setValue(value);
        return this;
    }

    public AutomationPracticePage typeUserEmail(String value){
        userEmail.setValue(value);
        return this;
    }

    public AutomationPracticePage chooseGender(String value){
        genderContainer.$$("label").findBy(text(value)).click();
        return this;
    }

    public AutomationPracticePage typeNumber(String value){
        userNumber.setValue(value);
        return this;
    }

    public AutomationPracticePage openCalendar(){
        dateOfBirthInput.click();
        return this;
    }

    public AutomationPracticePage chooseMonth(String value){
        datepickerMonth.selectOption(value);
        return this;
    }

    public AutomationPracticePage chooseYear(String value){
        datepickerYear.selectOption(value);
        return this;
    }

    public AutomationPracticePage chooseDay(String value){
        $$(".react-datepicker__day")
                .findBy(text(value))
                .click();
        return this;
    }

    public AutomationPracticePage chooseSubjects(String value1, String value2){
        subjects.setValue(value1).pressEnter();
        subjects.setValue(value2).pressEnter();
        return this;
    }

    public AutomationPracticePage chooseHobbies(String value){
        hobbies.$$("label")
        .findBy(text(value))
        .click();
        return this;
    }

    public AutomationPracticePage uploadPicture(String value){
        uploadPicture.uploadFromClasspath(value);
        return this;
    }

    public AutomationPracticePage checkUploadedPictureName(String value){
        uploadPicture.shouldHave(Condition.value(value));
        return this;
    }

    public AutomationPracticePage typeCurrentAddress(String value){
        currentAddress.setValue(value);
        return this;
    }

    public AutomationPracticePage scrollToState(){
        state.scrollTo().shouldHave(Condition.visible, enabled).click();
        return this;
    }

    public AutomationPracticePage selectState(String value){
        stateCityWrapper.shouldBe(visible, enabled)
                .$$("div")
                .findBy(text(value)).click();
        return this;
    }

    public AutomationPracticePage scrollToCity(){
        city.scrollTo().shouldHave(Condition.visible, enabled).click();
        return this;
    }

    public AutomationPracticePage selectStateCity(String value){
        stateCityWrapper.shouldBe(visible, enabled)
                .$$("div")
                .findBy(text(value)).click();
        return this;
    }

    public AutomationPracticePage submitButtonClick(){
        submitButton.scrollTo().click();
        return this;
    }

    public AutomationPracticePage checkModalTitleWindow(String value){
        modalTitleWindow.shouldHave(Condition.exactText(value));
        return this;
    }

    public AutomationPracticePage checkStudentName(String value){
        studentName.shouldHave(text(value));
        return this;

    }

    public AutomationPracticePage checkStudentEmail(String value){
        studentEmail.shouldHave(text(value));
        return this;
    }

    public AutomationPracticePage checkGender(String value){
        studentGender.shouldHave(text(value));
        return this;
    }

    public AutomationPracticePage checkMobileNumber(String value){
        studentMobile.shouldHave(text(value));
        return this;
    }

    public AutomationPracticePage checkDateOfBirth(String value){
        studentDateOfBirth.shouldHave(text(value));
        return this;
    }

    public AutomationPracticePage checkSubjects(String value1, String value2){
        studentSubjects.shouldHave(text(value1 + ", " + value2));
        return this;
    }

    public AutomationPracticePage checkHobbies(String value){
        studentHobbies.shouldHave(text(value));
        return this;
    }

    public AutomationPracticePage checkPicture(String value){
        studentPicture.shouldHave(text(value));
        return this;
    }

    public AutomationPracticePage checkAddresses(String value){
        studentAddress.shouldHave(text(value));
        return this;
    }

    public AutomationPracticePage checkStateAndCity(String value1, String value2){
        studentStateAndCity.shouldHave(text(value1 + " " + value2));
        return this;
    }

public AutomationPracticePage closeModalWindow(){
        modalWindow.click();
        return this;
    }

public AutomationPracticePage checkModalWindow(){
        modalWindow.shouldNotBe(visible);
        return this;
    }

    public AutomationPracticePage checkErrorFormMessage(String value){
        formError.shouldHave(Condition.exactText(value));
        return this;
    }

}
