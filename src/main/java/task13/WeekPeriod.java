package task13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

// Вывести на экран строку, которая представляет собой период длиной в неделю.
// Пример: 07 августа - 14 августа
public class WeekPeriod {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusDays(7);
        Locale locale = Locale.forLanguageTag("ru");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM", locale);

        String start = startDate.format(formatter);
        String end = endDate.format(formatter);

        System.out.println(start + " - " + end);
    }

}
