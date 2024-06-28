import java.util.*;
class HashSetDemo{
    public static void main(String[] args) {
        HashSet hs1=new HashSet();
        Set hs2=new HashSet();
        Set<Integer> eids=new HashSet<Integer>();
        eids.add(101);
        eids.add(101);
        eids.add(101);
        eids.add(102);
        eids.add(102);
        eids.add(103);
        eids.add(104);
        eids.add(null);
        eids.add(null);
        System.out.println(hs1);
        System.out.println(hs2);
        System.out.println(eids);
        System.out.println(eids.isEmpty());
        System.out.println("Using ForEach");
        for (Integer eid : eids) {
            System.out.println(eid);
        }
        System.out.println("Using -iterator");
        Iterator itr=eids.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}