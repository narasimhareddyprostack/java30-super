package FI4;

import java.util.ArrayList;

public class TestImpl2 {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Rahul");

        TestI p = list -> list.isEmpty();
        System.out.println(p.test(enames));

    }
}
