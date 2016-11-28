package Connection;

import Model.Data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager {

    public Connection getConnection() {
        String host = "localhost";
        String port = "1521";
        String db = "xe"; 
        String usr = "sia"; 
        String pwd = "sia"; 
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Maaf driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port + ":" + db, usr, pwd);
        } catch (SQLException ex) {
            System.out.println("koneksi tidak berhasil");
            System.out.println(ex.getMessage());
        }

        if (conn != null) {
            System.out.println("Koneksi ke database terbentuk");
        } else {
            System.out.println("Koneksi gagal terbentuk");
        }
        return conn;
    }

    public Data[] getListData() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        conn = this.getConnection();
        Data d[] = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT count(buys_computer) FROM SISTEM_CERDAS");
            rs.next();
            d = new Data[rs.getInt(1)];
            rs = st.executeQuery("SELECT AGE, INCOME, STUDENT, CREDIT_RATING, BUYS_COMPUTER FROM SISTEM_CERDAS");
            int index = 0;
            while (rs.next()) {
                d[index] = new Data();
                
                d[index].setAge(Integer.parseInt(rs.getString(1)));
                d[index].setIncome(rs.getString(2));
                if (rs.getString(3).equals("Y")) {
                      d[index].setStudent(true);
                }
                else if(rs.getString(3).equals("N")) {
                      d[index].setStudent(false);
                }
                d[index].setCredit_rating(rs.getString(4));
                if (rs.getString(5).equals("Y")) {
                      d[index].setBuys_computer(true);
                }
                else if(rs.getString(5).equals("N")) {
                      d[index].setBuys_computer(false);
                }
                index++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return d;
    }
}
