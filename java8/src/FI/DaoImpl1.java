package FI;

interface DaoI1{
        public abstract  void login();
}
public class DaoImpl1 {
    public static void main(String[] args) {
       DaoI dao=()->{System.out.println("Login Sucess");};
       dao.login();
    }
}
