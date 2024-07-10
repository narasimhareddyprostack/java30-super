package DateTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class AgeCaluculator {
    public static void main(String[] args) {
        LocalDate dob=LocalDate.of(1983,4,15);
        LocalDate cdt =LocalDate.now();
        Period p=Period.between(dob,cdt);
        System.out.println(" No of Years :"+p.getYears()
                +" and No of Months: " + p.getMonths()
                +" and No of Days:"+p.getDays());
    }
}
