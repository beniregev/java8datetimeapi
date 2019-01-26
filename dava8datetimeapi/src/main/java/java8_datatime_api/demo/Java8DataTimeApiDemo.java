package java8_datatime_api.demo;

import java8_datatime_api.datetime.UseLocalDateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Java8DataTimeApiDemo {
    //  "2018-03-26T01:55+01:00[Europe/Rome]"
    private static final String LOCAL_DATE_TIME_STRING = "2018-03-26T01:23";

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2018-03-26T10:15:30+02:00[Asia/Jerusalem]");

        LocalDateTime localDateTime = new UseLocalDateTime().getLocalDateTimeUsingParseMethod(LOCAL_DATE_TIME_STRING);
        LocalDateTime endOfDate1 = new UseLocalDateTime().getEndOfDayFromLocalDateTimeDirectly(localDateTime);
        LocalDateTime endOfDate2 = new UseLocalDateTime().getEndOfDayFromLocalDateTime(localDateTime);

        System.out.println("LocalDateTime = " + localDateTime);
        System.out.println("End of Date #1 = " + endOfDate1);
        System.out.println("End of Date #2 = " + endOfDate2);

        ZoneId zoneGMT = ZoneId.of("GMT");
        ZoneId zoneJerusalemIL = ZoneId.of("Asia/Jerusalem");
        ZoneId zoneBostonUS = ZoneId.of("America/New_York");

        LocalTime nowGMT = LocalTime.now(zoneGMT);
        LocalTime nowJerusalemIL = LocalTime.now(zoneJerusalemIL);
        LocalTime nowBostonUS = LocalTime.now(zoneBostonUS);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM uuuu VV");
        System.out.println(dtf.format(nowGMT));
        System.out.println(dtf.format(nowJerusalemIL));
        System.out.println(dtf.format(nowBostonUS));

        System.out.println(nowGMT);
        System.out.println(nowJerusalemIL);
        System.out.println(nowBostonUS);
    }
}
