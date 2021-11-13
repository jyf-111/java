import java.time.Clock;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

public class Date_ {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.toString());

        Calendar rightnow = Calendar.getInstance();
        System.out.println(rightnow.get(Calendar.DAY_OF_WEEK));

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());

        Instant instant = clock.instant();
        Date legacyDate = Date.from(instant);
        System.out.println(legacyDate.toString());
    }
}