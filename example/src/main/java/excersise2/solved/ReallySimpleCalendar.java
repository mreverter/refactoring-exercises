package excersise2.solved;

import java.util.Calendar;

/**
 * Use this calendar only when just the month is needed. Otherwise, use {@link FullCalendar }.
 */
public class ReallySimpleCalendar {

    private final Calendar calendar;

    public ReallySimpleCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public int getCurrentMonth() {
        return this.calendar.get(Calendar.MONTH);
    }
}