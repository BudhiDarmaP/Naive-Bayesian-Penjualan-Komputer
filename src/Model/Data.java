package Model;

import Connection.DatabaseManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author budhidarmap
 */
public class Data {

    private int age;
    private String income;
    private boolean student;
    private String credit_rating;
    private boolean buys_computer;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public String getCredit_rating() {
        return credit_rating;
    }

    public void setCredit_rating(String credit_rating) {
        this.credit_rating = credit_rating;
    }

    public boolean isBuys_computer() {
        return buys_computer;
    }

    public void setBuys_computer(boolean buys_computer) {
        this.buys_computer = buys_computer;
    }
    public static Data[] getListData() {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        conn = DatabaseManager.getConnection();
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
