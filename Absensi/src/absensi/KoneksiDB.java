package absensi;

/**
 *
 * @author Afandi-Nat
 */
import java.sql.*;
import javax.swing.*;

public class KoneksiDB {
    Connection conn = null;
    public static Connection ConnectDb(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/absensi","root","");
            return conn;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
