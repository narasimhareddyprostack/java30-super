package DateTimeAPI;

import java.time.Year;

public class LeapYear {
    public static void main(String[] args) {
        //int year=Year.now().getValue();
        int year=Year.of(2023).getValue();
        System.out.println(year);
        if(year%4 ==0){
            System.out.println("Current Year is Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
