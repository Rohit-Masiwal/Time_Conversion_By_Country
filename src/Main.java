import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        String timeZoneAsia = "Asia/Kolkata";
        String timeZoneAmerica = "America/New_York";

        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of(timeZoneAsia));

        TimezoneConverter timezoneConverter = new TimezoneConverter(localDateTime, timeZoneAsia, timeZoneAmerica);
        timezoneConverter.convertTimeZone();


        String timeZoneEurope = "Europe/London";
        TimezoneConverter timezoneConverter1 = new TimezoneConverter(localDateTime, timeZoneAsia, timeZoneEurope);
        timezoneConverter1.convertTimeZone();

        String timeZoneTokyo = "Asia/Tokyo";
        TimezoneConverter timezoneConverter2 = new TimezoneConverter(localDateTime, timeZoneAsia, timeZoneTokyo);
        timezoneConverter2.convertTimeZone();
    }
}
