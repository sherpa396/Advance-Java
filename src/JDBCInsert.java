import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsert {
   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
   static final String USER = "root";
   static final String PASS = "";

   public static void main(String[] args) {
      // Open a connection
      try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();) {
         // Execute a query
         System.out.println("Inserting records into the table...");
         String sql = "INSERT INTO Registration VALUES (1, 'Ram', 'Rai', 19)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (2, 'Laxman', 'Tamang', 26)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES (3, 'Karan', 'Khan', 31)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO Registration VALUES(4, 'Sumit', 'KC', 8)";
         stmt.executeUpdate(sql);
         System.out.println("Inserted records into the table...");
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
