import java.util.*;
class Test{
    public static void main(String[] args) {
        PriorityQueue<String> enames=new PriorityQueue<String>();
        System.out.println(enames);
        System.out.println(enames.add("Rahul"));
        enames.offer("Sonia");
        enames.offer("Priyanka");
        enames.offer("Modi");
        enames.offer("Dinesh");
        System.out.println(enames);

        System.out.println(enames.p);

      
    }
}