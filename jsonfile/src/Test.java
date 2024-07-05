class Parent{
    public void m1(){
        System.out.println("Parent Class");
    }
}
class Child extends  Parent{
    @Override
    public void m1() {
        super.m1();
    }
}
public class Test {
}
