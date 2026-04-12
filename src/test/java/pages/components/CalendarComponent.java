package pages.components;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
public void setDate(String day, String month, String year) {
    $("select.react-datepicker__month-select").selectOption(month);
    $("select.react-datepicker__year-select").selectOption(year);

    String formattedDay = String.format("%03d", Integer.parseInt(day));
    $(".react-datepicker__day--" + formattedDay)
            .shouldBe(visible)
            .click();
    }
}
