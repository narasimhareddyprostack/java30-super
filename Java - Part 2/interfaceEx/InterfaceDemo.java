interface Demo{
    public final static    int price=100;
}
class InterfaceDemo implements Demo{
    
    public static void main(String[] args) {

    InterfaceDemo i=new InterfaceDemo();
    System.out.println(price);
    System.out.println(Demo.price);
    System.out.println(i.price);
    System.out.println(InterfaceDemo.price);

    }
}