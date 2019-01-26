package java8_datatime_api.datetime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class UseLocalTime {
    public LocalTime getLocalTimeUsingFactoryOfMethod(int hour, int min, int seconds) {
        return LocalTime.of(hour, min, seconds);
    }

    public LocalTime getLocalTimeUsingParseMethod(String timeRepresentation) {
        return LocalTime.parse(timeRepresentation);
    }

    public LocalTime getLocalTimeFromClock() {
        return LocalTime.now();
    }

    public LocalTime addAnHour(LocalTime localTime) {
        return localTime.plus(1, ChronoUnit.HOURS);
    }

    public int getHourFromLocalTime(LocalTime localTime) {
        return localTime.getHour();
    }

    public LocalTime getLocalTimeWithMinuteSetToValue(LocalTime localTime, int minute) {
        return localTime.withMinute(minute);
    }
}
