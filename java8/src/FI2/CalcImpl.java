package FI2;

public class CalcImpl implements  CalcI{
    @Override
    public int squreIt(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        CalcI ci=new CalcImpl();
        System.out.println(ci.squreIt(10));
    }
}
