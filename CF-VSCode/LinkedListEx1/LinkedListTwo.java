import java.util.*;
class LinkedListTwo{
    public static void main(String[] args) {
       LinkedList<String> enames=new LinkedList<String>();
       System.out.println(enames);
       enames.add("Rahul");
       enames.add("Sonia");
       enames.add("Priyanka");
       enames.add("Modi");
       System.out.println(enames);
       Collections.sort(enames);

       System.out.println(enames);
       Collections.sort(enames,Collections.reverseOrder());
       
       System.out.println(enames);
       Collections.shuffle(enames);
       System.out.println(enames);
    }
}