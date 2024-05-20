//print 1,2,3,4,5,........., 50 00 000
/*
 *   intilization st : int i=1
 *   condition st    : i<=5000000
 *   incr/descr      : i++ / i=i+1
 * 
 */
class Test{
    public static void main(String[] args) {
        for(int i=1;i<=5000000;i++){
            System.out.println(i);
        }
    }
}