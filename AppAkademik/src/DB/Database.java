package DB;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author afandi
 */
public class Database {
    public Connection koneksi = null;
    public Statement perintah = null;
    public ResultSet hasil = null;
    private MysqlDataSource ds = new MysqlDataSource();

    public void bukaKoneksi(){
        try{
            ds.setServerName("localhost");
            ds.setUser("root");
            ds.setPassword("");
            ds.setDatabaseName("apakademik");
            koneksi = ds.getConnection();
            perintah = koneksi.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage());}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    public void tutupKoneksi(){
        try{
            hasil.close();
            perintah.close();
            koneksi.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }
}