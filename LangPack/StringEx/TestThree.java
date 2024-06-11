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
      /* System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
      System.out.println(s1.equals(s4)); */
      System.out.println(s1 == s2); //fasle
      System.out.println(s1 == s3); //false
      System.out.println(s1 == s4); //true ***
      System.out.println(s2 == s3); //true
      System.out.println(s2 == s4); //false
    }
}
