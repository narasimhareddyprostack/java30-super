package FI5;

public class Test2 implements  FunctionOne{

    @Override
    public String apply(String name) {
        return name.toUpperCase();
    }

    public static void main(String[] args) {
       FunctionOne fn=new Test2();
        System.out.println(fn.apply("rahul"));
    }
}
