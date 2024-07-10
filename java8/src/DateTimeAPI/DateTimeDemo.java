package DateTimeAPI;

import java.time.*;

public class DateTimeDemo {
    public static void main(String[] args) {
       LocalDate date=LocalDate.now();
       LocalTime time=LocalTime.now();
       LocalDateTime dt=LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dt);
        LocalDate dob=LocalDate.of(1983,04,15);
        System.out.println(dob);
        System.out.println(Month.of(4));
        System.out.println(Year.of(1983));

    }
}
