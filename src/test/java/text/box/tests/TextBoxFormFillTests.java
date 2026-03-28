package text.box.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TextBoxFormFillTests {

    @Test
    public void successfulFillForm() {
        open("https://qa-guru.github.io/one-page-form/text-box.html");
    }
}
