package text.box.tests;

import com.codeborne.selenide.Configuration;

public class BaseTest {
    static {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://qa-guru.github.io";
        Configuration.headless = false;
        Configuration.browserSize = "1920x1080";
        Configuration.screenshots = true;
        Configuration.timeout = 5000;
    }




}
