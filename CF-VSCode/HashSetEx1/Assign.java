import java.util.*;
public class Assign {
    public static void main(String[] args) {
        Set<String> enames=new HashSet<String>();
        enames.add("Rahul");
        enames.add("Anil");
        enames.add("Gautham");
        enames.add("Sonia");
        enames.add("Babu");
        System.out.println(enames);
        ArrayList<String> names=new ArrayList<String>(enames);
        Collections.sort(names,Collections.reverseOrder());
        System.out.println(names);
    }
}
