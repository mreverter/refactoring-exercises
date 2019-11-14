package excersise2.solved;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        ReallySimpleCalendar calendar = new ReallySimpleCalendar(new GregorianCalendar());
        int month = calendar.getCurrentMonth();
        System.out.println(month);
    }
}