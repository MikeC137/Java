import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Method for today's date
        System.out.println(today);

        LocalDate specificDate = LocalDate.of(2024, 12, 25); // Method for specific date
        System.out.println(specificDate);

        LocalTime now = LocalTime.now(); // Current time
        System.out.println(now);

        // Formatting and Parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTimeString = "2024-11-27 14:30:15";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println(parsedDateTime);

        // Duration
        LocalTime startTime = LocalTime.of(9, 15, 37);
        LocalTime endTime = LocalTime.of(17, 2, 45);

        Duration duration = Duration.between(startTime, endTime);
        System.out.println(duration);
        System.out.println(duration.toMinutes());

        // Period
        Period period = Period.between(today, specificDate);
        System.out.println(period); // Period until Christmas
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        // Zoned Date and Time
        ZonedDateTime nowZoned = ZonedDateTime.now();
        System.out.println(nowZoned);
    }
}