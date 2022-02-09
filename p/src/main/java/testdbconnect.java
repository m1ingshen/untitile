import java.sql.*;
public class testdbconnect {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/my_db" +
            "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static String user = "root";
    private static String password = "xxxxxxxx";
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL,user,password);
            stmt = conn.createStatement();
            String sql = "select id, username from usertable";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Integer id  = rs.getInt("id");
                String username = rs.getString("username");
                System.out.print("id: " + id);
                System.out.print(", username: " + username);
                System.out.print("\n");
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
