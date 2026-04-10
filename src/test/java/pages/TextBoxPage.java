package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxPage {
    //Elements
    String textBoxUrl = "/one-page-form/text-box.html";

    private final SelenideElement userNameInput = $("#userName"),
        userEmailInput = $("#userEmail"),
    userCurrentAddresslInput = $("#currentAddress");
    private final SelenideElement userPermanentAddresslInput = $("#permanentAddress");
    private final SelenideElement submitButton = $("#submit");

    private final SelenideElement outputTable = $("#output");

    //Actions
    public TextBoxPage openPage() {
        open(textBoxUrl);
        return this;
    }

    public TextBoxPage typeUserName(String value){
        userNameInput.setValue(value);

        return this;
    }

    public TextBoxPage typeUserEmail(String value){
        userEmailInput.setValue(value);
        return this;
    }

    public TextBoxPage typeCurrentAddress(String value){
        userCurrentAddresslInput.setValue(value);
        return this;
    }

    public TextBoxPage typePermanentAddress(String value){
        userPermanentAddresslInput.setValue(value);
        return this;
    }

    public TextBoxPage submitButtonClick(){
        submitButton.click();
        return this;
    }

    public TextBoxPage checkField(String key, String value) {
        outputTable.$(By.id(key)).shouldHave(Condition.text(value));
        return this;
    }

}
