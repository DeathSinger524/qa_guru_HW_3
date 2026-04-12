package pages.components;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FormResultsComponent {

    public FormResultsComponent checkModalTitleWindowOpen(String value) {
        $("#example-modal-sizes-title-lg").shouldHave(Condition.exactText(value));
        return this;
    }

    public FormResultsComponent checkModalTitleWindowClosed() {
        $("#closeModal").click();
        $("#closeModal").shouldNotBe(visible);
        return this;
    }

    public FormResultsComponent checkFormResults(String fieldName, String expectedValue) {
        $(".table-responsive")
                .$$( "tr")
                .findBy(text(fieldName))
                .shouldHave(text(expectedValue));
        return this;
    }
}