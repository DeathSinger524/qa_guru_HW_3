package text.box.tests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class TextBoxFormFillTests extends BaseTest {

    private final String url = "/one-page-form/text-box.html";

    @Test
    public void successfulFillForm() {
        open(url);
       $("[id=userName]").setValue("John Doe");
       $("[id=userEmail]").setValue("JohnDoe@yandex.ru");
       $("[id=currentAddress]").setValue("Vavilovo 16");
       $("[id=permanentAddress]").setValue("Albukerke");
       $("[id=submit").click();

       $("[id=name]").shouldHave(Condition.text("John Doe"));
       $("[id=email]").shouldHave(Condition.text("JohnDoe@yandex.ru"));
       $("[id=output]").$("[id=currentAddress]").shouldHave(Condition.text("Vavilovo 16"));
       $("[id=output]").$("[id=permanentAddress]").shouldHave(Condition.text("Albukerke"));
    }
}
