package practice.automation.form;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import text.box.tests.BaseTest;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormTests extends BaseTest {
    String automationPracticeFormUrl = "/one-page-form/automation-practice-form.html";

    @Test
    public void successfulFillForm() {
        open(automationPracticeFormUrl);
        $("[id=fixedban]").$("button[aria-label='Close']").click();
        $("[id=firstName]").setValue("John");
        $("[id=lastName]").setValue("Doe");
        $("[id=userEmail]").setValue("John@doe.ru");
        $("[id=gender-radio-3]").click();
        $("[id=userNumber]").setValue("9999999999");
        $("[id=dateOfBirthInput]").click();
        $("select.react-datepicker__month-select").selectOption("March");
        $("select.react-datepicker__year-select").selectOption("1999");
        $("span.react-datepicker__day.react-datepicker__day--025").click();
        $("[id=subjectsInput]").setValue("Art").pressEnter().setValue("Chemistry").pressEnter();
        $("[id=hobbies-checkbox-2]").click();
        $("[id=uploadPicture]").uploadFromClasspath("img.png");
        $("[id=uploadPicture]").shouldHave(Condition.value("img.png"));
        $("[id=currentAddress]").setValue("Saint Petersburg");
        $("[id=state]").scrollTo().shouldBe(visible, enabled).click();
        $("[id=stateCity-wrapper]").shouldBe(visible, enabled)
                .$$("div").findBy(text("Uttar Pradesh")).click();
        $("[id=city]").scrollTo().shouldBe(visible, enabled).click();
        $("[id=stateCity-wrapper]").shouldBe(visible, enabled)
                .$$("div").findBy(text("Lucknow")).click();
        $("[id=submit]").scrollTo().click();

        $("[id=example-modal-sizes-title-lg]").shouldHave(Condition.exactText("Thanks for submitting the form"));
        $("[id=resultBody]").$("tr:nth-child(1)").shouldHave(Condition.exactText("Student Name John Doe"));
        $("[id=resultBody]").$("tr:nth-child(2)").shouldHave(Condition.exactText("Student Email John@doe.ru"));
        $("[id=resultBody]").$("tr:nth-child(3)").shouldHave(Condition.exactText("Gender Other"));
        $("[id=resultBody]").$("tr:nth-child(4)").shouldHave(Condition.exactText("Mobile 9999999999"));
        $("[id=resultBody]").$("tr:nth-child(5)").shouldHave(Condition.exactText("Date of Birth 1999-03-25"));
        $("[id=resultBody]").$("tr:nth-child(6)").shouldHave(Condition.exactText("Subjects Arts, Chemistry"));
        $("[id=resultBody]").$("tr:nth-child(7)").shouldHave(Condition.exactText("Hobbies Reading"));
        $("[id=resultBody]").$("tr:nth-child(8)").shouldHave(Condition.exactText("Picture img.png"));
        $("[id=resultBody]").$("tr:nth-child(9)").shouldHave(Condition.exactText("Address Saint Petersburg"));
        $("[id=resultBody]").$("tr:nth-child(10)").shouldHave(Condition.exactText("State and City Uttar Pradesh Lucknow"));
        $("[id=closeModal]").click();
        $("[id=closeModal]").shouldNotBe(visible);
    }
        @Test
        public void negativeFillForm() {
            open(automationPracticeFormUrl);
            $("[id=fixedban]").$("button[aria-label='Close']").click();
            $("[id=firstName]").setValue("John");
            $("[id=lastName]").setValue("Doe");
            $("[id=userEmail]").setValue("John@doe.ru");
            $("[id=submit]").scrollTo().click();

            $("[id=formError]").shouldBe(Condition.exactText("Please fill required fields and enter a valid 10-digit mobile number."));
    }
}
