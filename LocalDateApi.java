/**
 * LocalDate
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
public class LocalDateApi {
   
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        // LocalDateTime date2 = LocalDateTime.of(2024, 10, 2);
        LocalDateTime yesterday = date.minusDays(1);
        LocalDateTime tomorrow = date.plusDays(1);

        System.out.println("today"+date);
        // System.out.println("today"+date2);
        System.out.println("yesterday"+yesterday);
        System.out.println("tomorrow"+tomorrow);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm-ss");
        System.out.println(date.format(formatter));

        ZoneId zoneId  =ZoneId.of("America/Panama");
        LocalDate date3 = LocalDate.now(zoneId);
        System.out.println("amrica"+date3);

    }
}