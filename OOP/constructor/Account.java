class Account {
    int acc_Id;
    String acc_Name;
    float acc_Bal;
    Account(int id,String name, float amount){
       this.acc_Id=id;
       this.acc_Name=name;
       this.acc_Bal=amount;
       
    }
    public void deposit_Amount(){}
    public int get_Bal(){
        return 0;
    }
    public static void main(String[] args) {
       Account a1=new Account(101,"Rahul",5000);
       System.out.println("Account Id:"+a1.acc_Id+"-Account Name:"+a1.acc_Name+"-Amount:"+a1.acc_Bal);
    }
}
