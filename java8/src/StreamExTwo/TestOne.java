package StreamExTwo;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class TestOne {
    public static void main(String[] args) {
        List<String> enames=Arrays.asList("rahul","sonia","priyana","Dheeran","thaharun","swathi","preethi","sai","swaroop","vishnu");
        System.out.println(enames);
        List<String> new_Enames=enames.stream()
                .sorted()
                .map(ename->ename.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(new_Enames);
    }
}
