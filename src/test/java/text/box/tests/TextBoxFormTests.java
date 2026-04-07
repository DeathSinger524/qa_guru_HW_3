package text.box.tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static testdata.TestData.*;

public class TextBoxFormTests extends BaseTest {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    public void successfulFillFormTest() {
        textBoxPage.openPage()
                .typeUserName(userName)
                .typeUserEmail(userEmail)
                .typeCurrentAddress(currentAddressInputData)
                .typePermanentAddress(permanentAddressInputData)
                .submitButtonClick()
                .checkName(userName) //ToDo реализовать метод для проверки полей
                .checkEmail(userEmail)
                .checkCurrentAddress(currentAddressOutputData)
                .checkPermanentAddress(permanentAddressOutputData);
    }

    @Test
    public void negativeFillFormTest() {
        textBoxPage.openPage()
                .submitButtonClick()
                .checkName(emptyName)
                .checkEmail(emptyEmail)
                .checkCurrentAddress(emptyCurrentAddress)
                .checkPermanentAddress(emptyPermanentAddress);
    }
}
