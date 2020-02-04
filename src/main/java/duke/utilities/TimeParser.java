package duke.utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
public interface TimeParser {
    static LocalDate parseDate(String date) throws DateTimeParseException {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("d/MM/yyyy"));
    }

    static String printDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("d MMM yyyy"));
    }
}