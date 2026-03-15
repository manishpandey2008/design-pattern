import java.time.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(getUtcDateFromLocalDate("2026-02-06","GMT-6"));
    }

    public static ZonedDateTime getUtcDateFromLocalDate(
            String date,
            String timeZoneId) {

        LocalDate localDate = LocalDate.parse(date);
        ZoneId zoneId = ZoneId.of(timeZoneId);
        LocalTime currentTime = LocalTime.now(zoneId);

        ZonedDateTime localZdt =
                ZonedDateTime.of(localDate, currentTime, zoneId);
        ZonedDateTime utcZdt =
                localZdt.withZoneSameInstant(ZoneOffset.UTC);

        return utcZdt;
    }
}
