package practice.automation.form;

import org.junit.jupiter.api.Test;
import text.box.tests.BaseTest;

import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeFormTests extends BaseTest {
    String automationPracticeFormUrl = "/one-page-form/automation-practice-form.html";

    @Test
    public void successfulFillForm() {
        open(automationPracticeFormUrl);
        //sleep(1000);
        $("#fixedban").$("button[aria-label='Close']").click();
//        sleep(1000);
        $("[id=firstName]").setValue("John");
        $("[id=lastName]").setValue("Doe");
        $("[id=userEmail]").setValue("John@doe.ru");
        $("[id=gender-radio-3]").click();
        $("[id=userNumber]").setValue("9999999999");
   //     $("[id=dateOfBirthInput]").setValue("25 March 1994");
        $("[id=subjectsInput]").setValue("Art").pressEnter().setValue("Chemistry").pressEnter();
        $("[id=hobbies-checkbox-2]").click();
    //    $("[id=uploadPicture]").click();
        $("[id=currentAddress]").setValue("Saint Petersburg");
    //    $("[id=stateCity-wrapper]").click();
    //    $("[id=city]").click();
        $("[id=submit]").scrollTo().click();
        sleep(2000);

        //ToDo написать проверки на появившееся окно с данными
    }
}
