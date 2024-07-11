package defaultmethod;

public class DaoImpl1 implements  DaoI{
    @Override
    public void login() {
        System.out.println("Login in success");
    }
    @Override
    public void logout() {
        System.out.println("Logout");
    }

    public static void main(String[] args) {
       DaoI obj=new DaoImpl1();
       obj.login();
       obj.logout();
    }
}
