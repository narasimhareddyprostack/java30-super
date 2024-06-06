class A{
}
class B extends A{
    public String toString(){
        return "B class ";
    }
}
class Test{
    public static void main(String[] args) {
        B obj=new B();
        System.out.println(obj);
        System.out.println(obj.toString());
    }
}