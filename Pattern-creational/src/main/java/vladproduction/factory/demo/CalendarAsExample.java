package vladproduction.factory.demo;

import java.util.Calendar;

public class CalendarAsExample {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
