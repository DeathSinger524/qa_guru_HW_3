package practice.automation.form;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import text.box.tests.BaseTest;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static testdata.TestData.*;

public class AutomationPracticeFormTests extends BaseTest {
    String automationPracticeFormUrl = "/one-page-form/automation-practice-form.html";

    @Test
    public void successfulFillFormTest() {
        open(automationPracticeFormUrl);
        $("#fixedban").$("button[aria-label='Close']").click();
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail);
        $("#genterWrapper").$$("label").findBy(text(gender)).click();
        $("#userNumber").setValue(userNumber);
        $("#dateOfBirthInput").click();
        $("select.react-datepicker__month-select").selectOption(month);
        $("select.react-datepicker__year-select").selectOption(year);
        $("span.react-datepicker__day.react-datepicker__day--0" + dayOFBirth).click();
        $("#subjectsInput").setValue(subjectArt).pressEnter().setValue(subjectChemistry).pressEnter();
        $("#hobbiesWrapper").$$("label").findBy(text(hobbies)).click();
        $("#uploadPicture").uploadFromClasspath(imageName);
        $("#uploadPicture").shouldHave(Condition.value(imageName));
        $("#currentAddress").setValue(currentAddressInputData);
        $("#state").scrollTo().shouldBe(visible, enabled).click();
        $("#stateCity-wrapper").shouldBe(visible, enabled).$$("div").findBy(text(state)).click();
        $("#city").scrollTo().shouldBe(visible, enabled).click();
        $("#stateCity-wrapper").shouldBe(visible, enabled).$$("div").findBy(text(city)).click();
        $("#submit").scrollTo().click();

        $("#example-modal-sizes-title-lg").shouldHave(Condition.exactText(messageAfterSubmitting));
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text(userName));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text(userEmail));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text(gender));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text(userNumber));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text(dateOfBirth));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text(subjectArt + ", " + subjectChemistry));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text(hobbies));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text(imageName));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text(currentAddressInputData));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text(state + " " + city));
        $("#closeModal").click();
        $("#closeModal").shouldNotBe(visible);
    }
        @Test
        public void negativeFillFormTest() {
            open(automationPracticeFormUrl);
            $("#fixedban").$("button[aria-label='Close']").click();
            $("#firstName").setValue(firstName);
            $("#lastName").setValue(lastName);
            $("#userEmail").setValue(userEmail);
            $("#submit").scrollTo().click();

            $("#formError").shouldBe(Condition.exactText(formErrorMessage));
    }
}