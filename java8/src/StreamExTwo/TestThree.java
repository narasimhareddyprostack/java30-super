package StreamExTwo;

import java.util.Arrays;
import java.util.List;

public class TestThree {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("rahul","sonia","priyana","Dheeran","thaharun","swathi","preethi","sai","swaroop","vishnu");
        System.out.println(enames);
        long no_of_emps=enames.stream()
                .filter(ename->ename.startsWith("p"))
                .count();
        System.out.println(no_of_emps);
    }
}
