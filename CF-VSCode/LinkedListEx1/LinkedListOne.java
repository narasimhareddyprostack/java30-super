import java.util.*;
class LinkedListOne{
    public static void main(String[] args) {
       LinkedList<String> enames=new LinkedList<String>();
       System.out.println(enames);
       enames.add("Rahul");
       enames.add("Sonia");
       enames.add("Priyanka");
       enames.add("Modi");
       System.out.println(enames);
       //how to find the size/length of LinkedList
       System.out.println(enames.size());
       //how to verify given LL is empty or not
       System.out.println(enames.isEmpty());
       //how to get LinkedList element - get method
       System.out.println(enames.get(1));
       //We can iterate using for loop,while,dowhile,forEach and iterator object
       //indexing is possible.

       Iterator itr=enames.iterator();
       while (itr.hasNext()) {
            System.out.println(itr.next());
       }
    }
}