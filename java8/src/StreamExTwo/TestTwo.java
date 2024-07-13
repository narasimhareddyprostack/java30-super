package StreamExTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestTwo {
    public static void main(String[] args) {
        List<String> enames=Arrays.asList("rahul","sonia","priyana","Dheeran","thaharun","swathi","preethi","sai","swaroop","vishnu");
        System.out.println(enames);

        List<String> new_Enames=new ArrayList<String>();

        Collections.sort(enames);
        System.out.println(enames);
        for (String ename:enames) {
                new_Enames.add(ename.toUpperCase());
        }
        System.out.println(new_Enames);
    }
}
