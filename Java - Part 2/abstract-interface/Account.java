abstract class Bank{
     abstract void cal_bal();
     
     void get_Details(){}
}
class Acccount extends Bank{
    @Override
    void cal_bal() {
        System.out.println("Displaying Account Bal");
        
    }
    public static void main(String[] args) {
      Acccount  a1=new Acccount();
      a1.cal_bal();
    }
}