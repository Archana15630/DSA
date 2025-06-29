
import java.sql.*;

public class FetchStudentDetails {
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/schooldb";
    static final String JDBC_USER = "root";
    static final String JDBC_PASSWORD = "archanamysql@123"; // Change this if your MySQL has a password

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            System.out.println("✅ Connected to MySQL database!");

           
            stmt = conn.createStatement();

            
            String sql = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(sql);

            
            System.out.println("ID\tName\t\tClass");
            System.out.println("----------------------------------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String studentClass = rs.getString("class");

                System.out.println(id + "\t" + name + "\t\t" + studentClass);
            }

           
            rs.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("🔒 Disconnected from MySQL.");
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
