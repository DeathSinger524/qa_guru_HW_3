package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import text.box.tests.BaseTest;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class TextBoxPage extends BaseTest {
    //Elements
    String textBoxUrl = "/one-page-form/text-box.html";

    private final SelenideElement userNameInput = $("#userName");
    private final SelenideElement userEmailInput = $("#userEmail");
    private final SelenideElement userCurrentAddresslInput = $("#currentAddress");
    private final SelenideElement userPermanentAddresslInput = $("#permanentAddress");
    private final SelenideElement submitButton = $("#submit");

    private final SelenideElement nameOutput = $("#name");
    private final SelenideElement emailOutput = $("#email");
    private final SelenideElement currentAddressOutput = $("#output").$("#currentAddress");
    private final SelenideElement permanentAddressOutput = $("#output").$("#permanentAddress");

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

    public TextBoxPage checkName(String value){
        nameOutput.shouldHave(Condition.text(value));
        return this;
    }

    public TextBoxPage checkEmail(String value){
        emailOutput.shouldHave(Condition.text(value));
        return this;
    }

    public TextBoxPage checkCurrentAddress(String value){
        currentAddressOutput.shouldHave(Condition.exactText(value));
        return this;
    }

    public TextBoxPage checkPermanentAddress(String value){
        permanentAddressOutput.shouldHave(Condition.exactText(value));
        return this;
    }

}
