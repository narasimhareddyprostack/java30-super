class Test{
    public static void main(String[] args) {
    String s1=new String("Rahul");
    String s2="Rahul";
    String s3="Rahul";

    System.out.println(s1.equals(s2));//true
    System.out.println(s1.equals(s3)); //true
    System.out.println(s1 == s2); //false
    System.out.println(s2 == s3); //true
    }
}