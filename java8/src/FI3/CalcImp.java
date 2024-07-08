package FI3;

public class CalcImp implements  PrI{
    public  boolean test(int num){
        return  num%2 ==0;
    }

    public static void main(String[] args) {
       PrI p=new CalcImp();
        System.out.println(p.test(31));
    }
}
