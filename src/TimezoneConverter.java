import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimezoneConverter {
    LocalDateTime localDateTime;
    String sourceTimeZone;
    String targetTimeZone;
    TimezoneConverter(LocalDateTime localDateTime, String sourceTimeZone, String targetTimeZone) {
        this.localDateTime = localDateTime;
        this.sourceTimeZone = sourceTimeZone;
        this.targetTimeZone = targetTimeZone;
    }

    public void convertTimeZone() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String localTime = formatter.format(localDateTime);
        System.out.println("Local time (" + sourceTimeZone + "): " + localTime);

        LocalDateTime countryDateTime = localDateTime.atZone(ZoneId.of(sourceTimeZone))
                .withZoneSameInstant(ZoneId.of(targetTimeZone))
                .toLocalDateTime();

        String countryTime = formatter.format(countryDateTime);

        System.out.println("Country time (" + targetTimeZone + "): " + countryTime);
    }
}
