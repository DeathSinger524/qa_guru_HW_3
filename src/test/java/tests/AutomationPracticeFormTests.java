package tests;

import org.junit.jupiter.api.Test;

import static testdata.TestData.messageAfterSubmitting;
import static utils.RandomUtils.*;

public class AutomationPracticeFormTests extends BaseTest {

    @Test
    public void successfulFillFormTest() {
        automationPracticePage.openPage()
                .closeCoursesWindow()
                .typeFirstName(testData.firstName)
                .typeLastName(testData.lastName)
                .typeUserEmail(testData.userEmail)
                .selectGender(getRandomGender())
                .typeNumber(getRandomPhone())
                //.setDateOfBirth(getRandomInt(1, 28), getRandomMonth(), getRandomInt(1975, 2026)) //ToDo продолжить отсюда!
//                .selectSubjects(subjectArt, subjectChemistry)
//                .selectHobbies(hobbies)
//                .uploadPicture(imageName)
//                .typeCurrentAddress(currentAddressInputData)
//                .setStateAndCity(state, city)
                 .submitButtonClick();
//
        formResultsComponent.checkModalTitleWindowOpen(messageAfterSubmitting)
//                .checkFormResults("Student Name", userName)
//                .checkFormResults("Student Email", userEmail)
//                .checkFormResults("Gender", gender)
                .checkFormResults("Mobile", getRandomPhone());
//                .checkFormResults("Date of Birth", dateOfBirth)
//                .checkFormResults("Subjects", subjectArt + ", " + subjectChemistry)
//                .checkFormResults("Hobbies", hobbies)
//                .checkFormResults("Picture", imageName)
//                .checkFormResults("Address", currentAddressInputData)
//                .checkFormResults("State and City", state + " " + city)
//                .checkModalTitleWindowClosed();
    }
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
}