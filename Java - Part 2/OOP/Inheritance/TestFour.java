class CEO{
    public void m1(){
        System.out.println("CEO Class - m1 method");
    }
}
class Manager1 extends CEO{
    public void m2(){
        System.out.println("CEO Class - m2 method");
    }
    public static void main(String[] args) {
        Manager1 mgr1=new Manager1();
        mgr1.m1();
        mgr1.m2();
      
}
}