package FI6;

import FI5.FunctionOne;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Test5 {
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("rahul");
        enames.add("sonia");
        enames.add("priyana");
        Function<List,Integer> fn1 = list->list.size();
        Function<String,Integer> fn2 = str->str.length();
        Function<List,Boolean> fn3 = userList->userList.isEmpty();

        System.out.println(fn1.apply(enames));
        System.out.println(fn2.apply("Rahul"));
        System.out.println(fn3.apply(enames));
    }
}
