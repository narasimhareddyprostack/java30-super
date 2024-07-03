import java.util.*;
class Test{
    public static void main(String[] args) {
        HashMap<String,String> emp=new HashMap<String,String>();
        System.out.println(emp);
        emp.put("id", "101");
        emp.put("ename", "Rahul Gandhi");
        emp.put("salary", "45000.00");
        System.out.println(emp);
        //print emp name
        System.out.println(emp.get("ename"));
    }
}