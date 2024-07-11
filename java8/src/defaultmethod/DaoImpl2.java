package defaultmethod;

public class DaoImpl2 implements  DaoI{
    @Override
    public void login() {
        System.out.println("Login in success");
    }
    @Override
    public void logout() {
        System.out.println("Logout");
    }
    public static void main(String[] args) {
        DaoI.greet();

        DaoI obj=new DaoImpl2();
        obj.login();
        obj.logout();
        obj.updateProfile();

    }
}
