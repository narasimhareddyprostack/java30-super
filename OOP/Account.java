public class Account {
    private int acc_Id;
    public void setAcc_Id(int id){
        this.acc_Id=id;
    }
    public int getAcc_Id(){
        return this.acc_Id;
    }

    public static void main(String[] args) {
        Account a1=new Account();
        a1.setAcc_Id(101);
        System.out.println(a1.getAcc_Id());
    }
}
