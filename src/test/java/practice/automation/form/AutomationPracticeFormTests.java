package practice.automation.form;

import org.junit.jupiter.api.Test;
import pages.AutomationPracticePage;
import text.box.tests.BaseTest;

import static testdata.TestData.*;

public class AutomationPracticeFormTests extends BaseTest {
AutomationPracticePage automationPracticePage = new AutomationPracticePage();

    @Test
    public void successfulFillFormTest() {
        automationPracticePage.openPage()
                        .closeCoursesWindow()
                        .typeFirstName(firstName)
                        .typeLastName(lastName)
                        .typeUserEmail(userEmail)
                        .chooseGender(gender)
                        .typeNumber(userNumber)
                        .setDateOfBirth(dayOFBirth, month, year)
                        .chooseSubjects(subjectArt, subjectChemistry)
                        .chooseHobbies(hobbies)
                        .uploadPicture(imageName)
                        .checkUploadedPictureName(imageName)
                        .typeCurrentAddress(currentAddressInputData)
                        .setStateAndCity(state, city)
                        .submitButtonClick()
                        .checkModalTitleWindow(messageAfterSubmitting)
                        .checkStudentName(userName)
                        .checkStudentEmail(userEmail)
                        .checkGender(gender)
                        .checkMobileNumber(userNumber)
                        .checkDateOfBirth(dateOfBirth)
                        .checkSubjects(subjectArt, subjectChemistry)
                        .checkHobbies(hobbies)
                        .checkPicture(imageName)
                        .checkAddresses(currentAddressInputData)
                        .checkStateAndCity(state, city)
                        .closeModalWindow()
                        .checkModalWindow();
    }
        @Test
        public void negativeFillFormTest() {
            automationPracticePage.openPage()
                    .closeCoursesWindow()
                    .typeFirstName(firstName)
                    .typeLastName(lastName)
                    .typeUserEmail(userEmail)
                    .submitButtonClick()
                    .checkErrorFormMessage(formErrorMessage);
    }
}