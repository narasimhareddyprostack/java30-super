class Test{
    int a;
    static int b=200;
   /*  Test(){
        super();
        this.a=10;
    } */
    public static void main(String[] args) {
        int c=300;
       Test t1=new Test();
        System.out.println(t1.a);
        System.out.println(b);
        System.out.println(c);
    }
}