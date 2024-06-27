import java.util.*;
class Test{
    public static void main(String[] args) {
       ArrayList<String> enames=new ArrayList<String>();
     
       System.out.println(enames);      //[]
       enames.add("Rahul");
       enames.add("Sonia");
       enames.add("Priyanka");
       enames.add("Modi");
       enames.add("Dinesh");
       System.out.println(enames);      //[Rahul, Sonia, Priyanka, Modi]
       System.out.println("*********Sorting ArrayList Objects****");

       Collections.sort(enames);
       System.out.println(enames);      //[Rahul, Sonia, Priyanka, Modi]
       
       Collections.sort(enames,Collections.reverseOrder());;
       System.out.println(enames);      //[Rahul, Sonia, Pr
       
       Collections.shuffle(enames);
       System.out.println(enames);
    }   
}