package BiFunSupplierEx;

import java.util.function.BiFunction;

public class TestThree {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> obj=(fn, ln)->(fn+ln).length();
        System.out.println(obj.apply("Rahul","Gandi"));
    }
}

