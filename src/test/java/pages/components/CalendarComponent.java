package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarComponent {
public void setDate(String day, String month, String year) {
    $("select.react-datepicker__month-select").selectOption(month);
    $("select.react-datepicker__year-select").selectOption(year);
    $$(".react-datepicker__day")
            .findBy(text(day))
            .click();
    }
}
