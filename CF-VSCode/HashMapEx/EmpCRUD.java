import java.util.*;
public class EmpCRUD {
        public static void main(String[] args) {
           Map<Integer,String> employees=new HashMap<Integer,String>();
           employees.put(101, "Rahul");
           employees.put(102, "Sonia");
           employees.put(103, "Priyanka");
           employees.put(104, "Modi");
           System.out.println(employees);
           
            for (Integer key : employees.keySet()) {
                    System.out.println(key+":"+employees.get(key));
            }
            Set<Map.Entry<Integer,String>> emp_entries=employees.entrySet();
            for(Map.Entry<Integer,String> entry:emp_entries){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }

        }   
}
