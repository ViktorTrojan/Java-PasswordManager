
public class Main {

    public DB_Manager db;
    public static Main i;
    public Login login;
    public Register register;
    public Password_GUI password_gui;

    public Main() {
        i = this;
        db = new DB_Manager();
        
        login = new Login();
        login.setVisible(true);
        
        register = new Register();
    }

    public static void main(String[] args) {
        Main m = new Main();
    }

}
