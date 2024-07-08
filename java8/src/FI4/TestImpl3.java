package FI4;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestImpl3 {
    public static void main(String[] args) {
        ArrayList<String> enames=new ArrayList<String>();
        enames.add("Rahul");
        enames.add("Rahul");
        Predicate<List> p = list->list.isEmpty();

        Function<List,Integer> f= list->list.size();

        System.out.println(p.test(enames)); //fasle
        System.out.println(f.apply(enames)); //2
    }
}
