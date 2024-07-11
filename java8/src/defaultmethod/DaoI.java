package defaultmethod;

public interface DaoI {
    public  abstract  void login();
    public  abstract  void logout();

    public default void updateProfile(){
        System.out.println("Updating Profile");
    };
    public static void greet(){
        System.out.println("Welcome to Airteal!");
    }
}
