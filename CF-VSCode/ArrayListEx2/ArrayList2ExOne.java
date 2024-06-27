import java.util.*;
class Test{
    public static void main(String[] args) {
       ArrayList<String> enames=new ArrayList<String>();
       System.out.println(enames.size());// 0
       System.out.println(enames);      //[]
       enames.add("Rahul");
       enames.add("Sonia");
       enames.add("Priyanka");
       enames.add("Modi");
       System.out.println(enames);// [Rahul, Sonia, Priyanka, Modi]
       System.out.println(enames.size()); //4
       System.out.println(enames.isEmpty()); //false

       System.out.println(enames.get(0));
       //System.out.println(enames.get(10));//IndexOutOfBoundsException
       
       int i =0;
       while(i<=enames.size()-1) {
        System.out.println(enames.get(i));
        i++;
       }
       System.out.println("*****using for Each******");
       for (String ename : enames) {
            System.out.println(ename);
       }
       System.out.println("*****using -Iterator******");
       Iterator itr=enames.iterator();
       while (itr.hasNext()) {
            System.out.println(itr.next());
       }

       
    }   
}