package StaticMethods;

interface  DaoI{
    public  static  void greet(){
        System.out.println("Welcome to Bank Services");
    }
  public  abstract   void login();
   public abstract  void logout();
}
public class DaoImpl implements  DaoI{
    @Override
    public void login() {
    }
    @Override
    public void logout() {
    }

    public static void main(String[] args) {

        DaoI.greet();
    }
}
