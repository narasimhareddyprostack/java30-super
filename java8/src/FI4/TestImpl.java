package FI4;

import java.util.ArrayList;
import java.util.List;
public class TestImpl implements  TestI{
    @Override
    public boolean test(List list) {
        return list.isEmpty();
    }
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Rahul");

        TestI p=new TestImpl();
        System.out.println(p.test(enames));
    }
}
