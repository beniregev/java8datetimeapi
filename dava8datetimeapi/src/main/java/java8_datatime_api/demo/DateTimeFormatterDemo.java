package java8_datatime_api.demo;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {
        ZonedDateTime dateTime = ZonedDateTime.parse("2007-12-03T10:15:30+01:00[Asia/Jerusalem]");
        System.out.println(dateTime);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss VV");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("19801211123456 America/Chicago", formatter1);
        System.out.println(zonedDateTime);

        ZonedDateTime d1 = ZonedDateTime.parse("2016-12-02T11:15:30-05:00[US/Central]");
        ZonedDateTime d2 = ZonedDateTime.parse("2016-12-02T11:15:30-05:00");
        System.out.println(d1);
        System.out.println(d2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss VV");
        ZonedDateTime date = ZonedDateTime.parse("2017-Apr-16 02:09:10 America/Los_Angeles", formatter);
        System.out.println(date);

    }
}
