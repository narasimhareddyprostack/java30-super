package pack4;
import pack1.A;
class D extends A{
    public static void main(String[] args) {
        A a1=new A();
        a1.m1();
        //a1.m2();
        D d1=new D();
        d1.m1();
        d1.m2();
        //d1.m3();
    }
}