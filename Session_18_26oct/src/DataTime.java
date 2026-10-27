
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.DateTimeException;
import java.util.Scanner;
import java.util.Set;

public class DataTime {
    public static void main(String[] args) {

        // LocalTime now = LocalTime.now();
        // System.out.println(now);

        // LocalTime customTime = LocalTime.of(13, 32, 34);
        // System.out.println(customTime);

        // LocalTime par = LocalTime.parse("15:30:45");
        // System.out.println(par);

        // ZonedDateTime now = ZonedDateTime.now();
        // System.out.println(now);

        // Set<String> availableZones = ZoneId.getAvailableZoneIds();
        // availableZones.forEach(System.out::println);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a time zone (e.g. Asia/Tokyo): ");
        String zoneInput = sc.nextLine();

        try {
            ZoneId zone = ZoneId.of(zoneInput);

            ZonedDateTime currentTime = ZonedDateTime.now(zone);

            System.out.println("Time zone: " + zone);
            System.out.println("Current date and time: " + currentTime);

        } catch (DateTimeException e) {
            System.out.println("Invalid time zone! "
                    + "Please enter a valid zone ID.");
        }

        sc.close();
    }
}
