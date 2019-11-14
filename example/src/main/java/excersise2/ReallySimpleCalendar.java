package excersise2;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This class represents a really simple calendar.
 */
public class ReallySimpleCalendar {

    private final GregorianCalendar value;

    /**
     * Default constructor
     */
    public ReallySimpleCalendar() {
        this.value = new GregorianCalendar();
    }

    // Gets the current month
    public int getMonth() {
        return this.value.get(Calendar.MONTH);
    }
}