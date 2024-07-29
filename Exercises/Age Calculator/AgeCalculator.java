import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Ask for date of birth
        System.out.print("Enter your date of birth(yyyy-MM-dd): ");
        String dateOfBirth = scanner.nextLine();

        // Get current time
        LocalDate today = LocalDate.now();

        // Parse Birthday
        LocalDate parsedBirthday = LocalDate.parse(dateOfBirth);

        // Get Period
        Period period = Period.between(today, parsedBirthday);

        // Display Age
        System.out.println("Years" + period.getYears() + "\nMonths" + period.getMonths() + "\nDays" + period.getDays());
    }
}