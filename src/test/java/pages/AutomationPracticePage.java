package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import text.box.tests.BaseTest;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticePage extends BaseTest {
    CalendarComponent   calendarComponent = new CalendarComponent();
    //Elements
    String automationPracticeUrl = "/one-page-form/automation-practice-form.html";

    private final SelenideElement closeCoursesButton = $("#fixedban").$("button[aria-label='Close']");
    private final SelenideElement firstName = $("#firstName");
    private final SelenideElement lastName = $("#lastName");
    private final SelenideElement userEmail = $("#userEmail");
    private final SelenideElement genderContainer = $("#genterWrapper");
    private final SelenideElement userNumber = $("#userNumber");

    private final SelenideElement subjects = $("#subjectsInput");
    private final SelenideElement hobbies = $("#hobbiesWrapper");
    private final SelenideElement uploadPicture = $("#uploadPicture");
    private final SelenideElement currentAddress = $("#currentAddress");
    private final SelenideElement stateSelect = $("#state");
    private final SelenideElement stateCityContainer = $("#stateCity-wrapper");
    private final SelenideElement citySelect = $("#city");
    private final SelenideElement submitButton = $("#submit");

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

    public AutomationPracticePage selectGender(String value){
        genderContainer.$$("label").findBy(text(value)).click();
        return this;
    }

    public AutomationPracticePage typeNumber(String value){
        userNumber.setValue(value);
        return this;
    }

    public AutomationPracticePage setDateOfBirth(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

    public AutomationPracticePage selectSubjects(String value1, String value2){
        subjects.setValue(value1).pressEnter();
        subjects.setValue(value2).pressEnter();
        return this;
    }

    public AutomationPracticePage selectHobbies(String value){
        hobbies.$$("label")
        .findBy(text(value))
        .click();
        return this;
    }

    public AutomationPracticePage uploadPicture(String value){
        uploadPicture.uploadFromClasspath(value);
        return this;
    }

    public AutomationPracticePage typeCurrentAddress(String value){
        currentAddress.setValue(value);
        return this;
    }

    public AutomationPracticePage setState(String value){
        stateSelect.scrollTo().shouldHave(Condition.visible, enabled).click();
        stateCityContainer.shouldBe(visible, enabled).$(byText(value)).click();

        return this;
    }

    public AutomationPracticePage setCity(String value){
        citySelect.scrollTo().shouldHave(Condition.visible, enabled).click();
        stateCityContainer.shouldBe(visible, enabled).$(byText(value)).click();
        return this;
    }

    public AutomationPracticePage setStateAndCity(String state, String city){
        setState(state);
        setCity(city);
        return this;
    }

    public AutomationPracticePage submitButtonClick(){
        submitButton.scrollTo().click();
        return this;
    }

    public AutomationPracticePage checkErrorFormMessage(String value){
        formError.shouldHave(Condition.exactText(value));
        return this;
    }

}
