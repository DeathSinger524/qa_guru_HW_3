package practice.automation.form;

import org.junit.jupiter.api.Test;
import pages.AutomationPracticePage;
import pages.components.FormResultsComponent;
import text.box.tests.BaseTest;

import static testdata.TestData.*;

public class AutomationPracticeFormTests extends BaseTest {
    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    FormResultsComponent formResultsComponent = new FormResultsComponent();
}
//
//    @Test
//    public void successfulFillFormTest() {
//        automationPracticePage.openPage()
//                .closeCoursesWindow()
//                .typeFirstName(firstName)
//                .typeLastName(lastName)
//                .typeUserEmail(userEmail)
//                .selectGender(gender)
//                .typeNumber(userNumber)
//                .setDateOfBirth(dayOFBirth, month, year)
//                .selectSubjects(subjectArt, subjectChemistry)
//                .selectHobbies(hobbies)
//                .uploadPicture(imageName)
//                .typeCurrentAddress(currentAddressInputData)
//                .setStateAndCity(state, city)
//                .submitButtonClick();
//
//        formResultsComponent.checkModalTitleWindowOpen(messageAfterSubmitting)
//                .checkFormResults("Student Name", userName)
//                .checkFormResults("Student Email", userEmail)
//                .checkFormResults("Gender", gender)
//                .checkFormResults("Mobile", userNumber)
//                .checkFormResults("Date of Birth", dateOfBirth)
//                .checkFormResults("Subjects", subjectArt + ", " + subjectChemistry)
//                .checkFormResults("Hobbies", hobbies)
//                .checkFormResults("Picture", imageName)
//                .checkFormResults("Address", currentAddressInputData)
//                .checkFormResults("State and City", state + " " + city)
//                .checkModalTitleWindowClosed();
//    }
//
//        @Test
//        public void negativeFillFormTest() {
//            automationPracticePage.openPage()
//                    .closeCoursesWindow()
//                    .typeFirstName(firstName)
//                    .typeLastName(lastName)
//                    .typeUserEmail(userEmail)
//                    .submitButtonClick()
//                    .checkErrorFormMessage(formErrorMessage);
//    }
//}