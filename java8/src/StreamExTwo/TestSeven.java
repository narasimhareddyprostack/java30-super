package StreamExTwo;

import java.util.Arrays;
import java.util.List;

public class TestSeven {
        public static void main(String[] args) {
                List<String> enames= Arrays.asList("rahul","sonia","priyanka","Dheeran","thaharun","swathi","preethi","sai","swaroop","vishnu");
                System.out.println(enames);
                for (String ename:enames) {
                        if(ename.startsWith("p")){
                                System.out.println(ename.toUpperCase());
                        }
                }
        }
}
