package text.box.tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
import testdata.TestData;

import static testdata.TestData.*;

public class TextBoxFormTests extends BaseTest {
    TextBoxPage textBoxPage = new TextBoxPage();
    TestData testData = new TestData();

    @Test
    public void successfulFillFormTest() {
        textBoxPage.openPage()
                .typeUserName(testData.userName)
                .typeUserEmail(testData.userEmail)
                .typeCurrentAddress(testData.currentAddressInputData)
                .typePermanentAddress(testData.permanentAddressInputData)
                .submitButtonClick()
                .checkField("name", testData.userName)
                .checkField("email", testData.userEmail)
                .checkField("currentAddress", testData.currentAddressOutputData)
                .checkField("permanentAddress", testData.permanentAddressOutputData);
    }

    @Test
    public void negativeFillFormTest() {
        textBoxPage.openPage()
                .submitButtonClick()
                .checkField("name", emptyName)
                .checkField("email", emptyEmail)
                .checkField("currentAddress", emptyCurrentAddress)
                .checkField("permanentAddress", emptyPermanentAddress);
    }
}
