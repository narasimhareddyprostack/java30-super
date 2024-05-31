public class Employee{
    int eid;
    String ename;
    public Employee(String name,int id){
        this.eid=id;
        this.ename=name;
    }
    public static void main(String[] args) {
        new Employee(101,"Rahul");
    }
}
