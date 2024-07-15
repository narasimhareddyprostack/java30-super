package BiFunSupplierEx;

interface TestI{
    public  abstract  int apply(String fname,String lname);
}
public class TestOne implements  TestI{
    @Override
    public int apply(String fname, String lname) {
        return (fname+lname).length();
    }
    public static void main(String[] args) {
         TestI  obj=new TestOne();
        System.out.println(obj.apply("Rahul","Gandhi"));
    }
}
