package BiFunSupplierEx;

public class TestTwo {
    public static void main(String[] args) {
        TestI obj=(fn, ln)->(fn+ln).length();
        System.out.println(obj.apply("Rahul","Gandhi"));
    }
}
