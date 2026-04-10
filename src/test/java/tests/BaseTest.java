package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.AutomationPracticePage;
import pages.TextBoxPage;
import pages.components.FormResultsComponent;
import testdata.TestData;

public class BaseTest {
    public AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    public TextBoxPage textBoxPage = new TextBoxPage();
    public FormResultsComponent formResultsComponent = new FormResultsComponent();
    public TestData testData = new TestData();

    @BeforeAll
    public static void beforeAll() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://qa-guru.github.io";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.screenshots = true;
        Configuration.timeout = 5000;
    }
}
