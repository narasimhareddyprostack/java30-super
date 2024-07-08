package FI3;

import java.util.function.Predicate;

public class CalcImpl2 {
    public static void main(String[] args) {
        PrI p= num-> num%2 ==0;
        System.out.println(p.test(31));
    }
}
