package DateTimeAPI;

import java.time.Year;

public class LeapYearDemo {
    public static void main(String[] args) {
        System.out.println(Year.now().isLeap());
        Year year=Year.of(2004);
        System.out.println(year.isLeap());
        if(year.isLeap()){
            System.out.println("Given Year is Leap Year");
        }
        else{
            System.out.println("Given Year is not a Leap Year");
        }
    }
}
