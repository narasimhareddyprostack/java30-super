public class Local {
        public static void main(String[] args) {
           m1();
        }
        public static void m1(){
            int a=10;
            System.out.println(a);
            m2();
        }
        public static void m2(){
            System.out.println(a);
        }

}
