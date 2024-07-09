package FI5;

import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) {

        Function<String,String> fn1= str->str.toUpperCase();
        System.out.println(fn1.apply("rahul"));

        FunctionOne fn2=name->name.toUpperCase();
        System.out.println(fn2.apply("rahul"));

    }
}
