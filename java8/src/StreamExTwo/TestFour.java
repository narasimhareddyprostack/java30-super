package StreamExTwo;

import java.util.*;

public class TestFour {
    public static void main(String[] args) {
        List<String> enames=Arrays.asList("rahul","sonia","priyana","Dheeran","thaharun","swathi","preethi","sai","swaroop","vishnu");

        int no_of_emps=0;
        Iterator itr=enames.iterator();
        while(itr.hasNext()){
            if(itr.next().toString().startsWith("p")){
                no_of_emps++;
            }
        }
        System.out.println(no_of_emps);
    }
}
