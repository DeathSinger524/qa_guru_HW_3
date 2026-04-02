package text.box.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static testdata.TestData.*;

public class TextBoxFormTests extends BaseTest {
    String textBoxUrl = "/one-page-form/text-box.html";

    @Test
    public void successfulFillFormTest() {
        open(textBoxUrl);
       $("#userName").setValue(userName);
       $("#userEmail").setValue(userEmail);
       $("#currentAddress").setValue(currentAddress);
       $("#permanentAddress").setValue(permanentAddress);
       $("#submit").click();

       $("#name").shouldHave(Condition.text(userName));
       $("#email").shouldHave(Condition.text(userEmail));
       $("#output").$("#currentAddress").shouldHave(Condition.text(currentAddress));
       $("#output").$("#permanentAddress").shouldHave(Condition.text(permanentAddress));
    }

    @Test
    public void negativeFillFormTest() {
        open(textBoxUrl);
        $("#submit").click();

        $("#name").shouldHave(Condition.exactText(emptyName));
        $("#email").shouldHave(Condition.exactText(emptyEmail));
        $("#output").$("#currentAddress").shouldHave(Condition.exactText(emptyCurrentAddress));
        $("#output").$("#permanentAddress").shouldHave(Condition.exactText(emptyPermanentAddress));
    }
}
