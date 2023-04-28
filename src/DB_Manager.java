
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB_Manager {

    private Connection conn = null;
    private static final String MYSQL_USER = "root";
    private static final String MYSQL_PASSWORD = "";
    private static final String MYSQL_IP = "localhost/passwordmanager";

    public DB_Manager() {
        if (!connectToDB()) {
            Login.info.setText("[-] Couldn't connect to DB!");
            System.exit(0);
        } else {
            System.out.println("[+] Connected to DB");
        }
    }

    public boolean connectToDB() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + MYSQL_IP, MYSQL_USER, MYSQL_PASSWORD);
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }

    // TODO: rename if this works for deleting rows aswell
    public boolean insertQuery(String query, String[] values) {
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            for (int i = 0; i < values.length; i++) {
                stmt.setString(i + 1, values[i]);
            }

            int numRowsAffected = stmt.executeUpdate();
            if (numRowsAffected == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DB_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public ResultSet query(String query, String[] values) {
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            for (int i = 0; i < values.length; i++) {
                stmt.setString(i + 1, values[i]);
            }

            ResultSet rs = stmt.executeQuery();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DB_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ResultSet queryBool(String query, String[] values) {
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            for (int i = 0; i < values.length; i++) {
                stmt.setString(i + 1, values[i]);
            }

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs;
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB_Manager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String hashPassword(String password) {
        String hashedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            hashedPassword = String.format("%064x", new java.math.BigInteger(1, digest));
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
        return hashedPassword;
    }
}
