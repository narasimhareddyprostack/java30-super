class Parent{}
class Child extends Parent{}
class Test {
    public static void main(String[] args) {
       Parent p1=new Parent();
       Child c1=new Child();
       int a=10;
       int b=20;
       int c=10;
       String s1=new String("Rahul");
       String s2="Rahul";
       String s3="Rahul";
       String s4=new String("Rahul");
       //System.out.println(a.eqauls(b));
       System.out.println(p1.equals(c1));
       System.out.println(p1 ==c1);
    }
}
