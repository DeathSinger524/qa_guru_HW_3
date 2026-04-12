package tests;

import org.junit.jupiter.api.Test;

import static testdata.TestData.messageAfterSubmitting;

public class AutomationPracticeFormTests extends BaseTest {

    @Test
    public void successfulFillFormTest() {
        automationPracticePage.openPage()
                .closeCoursesWindow()
                .typeFirstName(testData.firstName)
                .typeLastName(testData.lastName)
                .typeUserEmail(testData.userEmail)
                .selectGender(testData.gender)
                .typeNumber(testData.userNumber)
                .setDateOfBirth(testData.day, testData.month, testData.year)
                .selectSubjects(testData.subjectOne, testData.subjectTwo)
                .selectHobbies(testData.hobbies)
                .uploadPicture(testData.imageName)
                .typeCurrentAddress(testData.currentAddressInputData)
                .setState(testData.state)
                .setCity(testData.city)
                 .submitButtonClick();

        formResultsComponent.checkModalTitleWindowOpen(messageAfterSubmitting)
                .checkFormResults("Student Name", testData.firstName)
                .checkFormResults("Student Email", testData.userEmail)
                .checkFormResults("Gender", testData.gender)
                .checkFormResults("Mobile", testData.userNumber)
                .checkFormResults("Date of Birth", testData.dateOfBirth)
                .checkFormResults("Subjects", testData.subjectOne + ", " + testData.subjectTwo)
                .checkFormResults("Hobbies", testData.hobbies)
                .checkFormResults("Picture", testData.imageName)
                .checkFormResults("Address", testData.currentAddressInputData)
                .checkFormResults("State and City", testData.state + " " + testData.city)
                .checkModalTitleWindowClosed();
    }

        @Test
        public void negativeFillFormTest() {
            automationPracticePage.openPage()
                    .closeCoursesWindow()
                    .typeFirstName(testData.firstName)
                    .typeLastName(testData.lastName)
                    .typeUserEmail(testData.userEmail)
                    .submitButtonClick()
                    .checkErrorFormMessage(testData.formErrorMessage);
    }
}