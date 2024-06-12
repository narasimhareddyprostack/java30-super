class P{

}
class C {

}
class Test {
    public static void main(String[] args) {
        String s1="Rahul";
        String s2=new String("Rahul");
        StringBuffer s3=new StringBuffer("Rahul");
        String s4=new String("Rahul");
        P p1=new P();
        C c1=new C();

        int a=100;
        int b=200;
        //System.out.println(p1 == c1);//false
        //System.out.println(s1 == s2);//false
        //System.out.println(s3 == s4);

        //System.out.println(p1.equals(c1));//false
        //System.out.println(s1.equals(c1));//false
        //System.out.println(s1.equals(s2));//true
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s4.equals(s1));
    }    
}
