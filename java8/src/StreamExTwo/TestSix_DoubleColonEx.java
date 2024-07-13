package StreamExTwo;

import java.util.Arrays;
import java.util.List;

public class TestSix_DoubleColonEx {
        public static void main(String[] args) {
                List<String> enames= Arrays.asList("rahul","sonia","priyanka","Dheeran","thaharun","swathi","preethi","sai","swaroop","vishnu");
                System.out.println(enames);
                enames.stream()
                        .filter(ename->ename.startsWith("p"))
                        .map(ename->ename.toUpperCase())
                        .forEach(System.out::println);
        }
}
