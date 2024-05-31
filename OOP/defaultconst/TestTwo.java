class Parent{
    Parent(){
        super();
        System.out.println("Parent class Constructor");
    }
}
class Child extends Parent{
    Child(){
        super();
        System.out.println("Child class Constructor");
    }
    public static void main(String[] args) {
        new Child();
    }
}