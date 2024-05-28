interface Bank{
   public abstract void m1();
   public void m2();
   abstract void m3();
}
class Account implements Bank{
  public  void m1(){
    System.out.println("Account class - m1 method");
  }
  public  void m2(){
    System.out.println("Account class - m2 method");
  }
  public  void m3(){
    System.out.println("Account class - m3 method");
  }
  public static void main(String[] args) {
    Acccount a1=new Acccount();
    a1.m1();
    a1.m2();
    a1.m3();
  }
}