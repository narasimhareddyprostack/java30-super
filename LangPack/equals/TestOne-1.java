class A{}
class B extends A{}
public class TestOne {
    public static void main(String[] args) {
       A a=new A();
       B b=new B();

       String s1="Rahul";
       String s2="Gandhi";
       String s3="Rahul";

       int id1=100;
       int id2=200;
       int id3=100;

       System.out.println(a.equals(b));//false
       System.out.println(a==b);       //false
       
       

    }
}
