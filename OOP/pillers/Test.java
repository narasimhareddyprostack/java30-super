package pillers;

public class Test {
    public static void main(String[] args) {
        SA sa1=new SA();
        sa1.setAcc_Id(101);
        sa1.setAcc_Name("Rahul");
        sa1.setMin_Bal(5000);

        //print balance
        sa1.cal_Bal();
    }
}
