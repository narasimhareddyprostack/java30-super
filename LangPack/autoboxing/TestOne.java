class Test{
    public static void main(String[] args) {
        int a=100;
        //Integer i =a; //auto boxing
        Integer i = Integer.valueOf(a);

        //int b = i;
        int b = i.intValue();

        System.out.println(a);
        System.out.println(b);

        System.out.println(i);
        System.out.println(i.toString());
    }
}