import java.util.*;
class Test{
    public static void main(String[] args) {
        HashMap<String,String> emp=new HashMap<String,String>();
       
        emp.put("id", "101");
        emp.put("ename", "Rahul Gandhi");
        emp.put("salary", "45000.00");
        emp.put(null, null);
        System.out.println(emp);
        //print emp name,id,sala
        System.out.println(emp.get("ename"));
        System.out.println(emp.get("id"));
        System.out.println(emp.get("salary"));
        System.out.println(emp.get(null));

        System.out.println(emp.values());
        System.out.println(emp.keySet());
        System.out.println(emp.entrySet());
    }
}