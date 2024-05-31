class Account{
    String acc_Name;
    String acc_Addr;
    Account(String name, String addr){
        this.acc_Name=name;
        this.acc_Addr=addr;
    }
}
class SA extends Account{
    int acc_Id;
    int acc_Bal;
    SA(int id,String name,String addr,int amount){
        super(name,addr);
        this.acc_Id=id;
        this.acc_Bal=amount;

    }
    public static void main(String[] args) {
        SA sa1=new SA(101,"Rahul","Wayanad",45000);
        System.out.println("Account Holder Name: "+sa1.acc_Name+"- and Balance is:"+sa1.acc_Bal);
    }
}