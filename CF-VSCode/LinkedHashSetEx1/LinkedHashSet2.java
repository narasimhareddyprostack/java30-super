import java.util.LinkedHashSet;
import java.util.Iterator;
class Test{
    public static void main(String[] args) {
        LinkedHashSet<Integer> eids=new LinkedHashSet<Integer>();
        eids.add(101);
        eids.add(102);
        eids.add(103);
        eids.add(null);
        eids.add(104);
        
        for(int i=0;i<=eids.size()-1;i++){
            System.out.println(eids[i]);
        }
       /*  Iterator itr=eids.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        } */
     /*    for (Integer eid : eids) {
                System.out.println(eid);
        } */
    }
}