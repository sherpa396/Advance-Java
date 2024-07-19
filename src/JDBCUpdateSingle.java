
// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// // This class demonstrates use of multiple inserts within a single SQL

// public class JDBCUpdateSingle {

//     static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";
//     static final String USER = "root";
//     static final String PASS = "";

//     /**
//      * @param args
//      */
//     public static void main(String args[]) {
//         try {
//             Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//             Statement stmt = conn.createStatement();
//             stmt.execute(
//             "INSERT INTO STUDENTS(id, name) VALUES(3, 'Pasang'), (4, 'Ram');"
//             System.out.println("----- Successfully inserted into table STUDENTS ----");
//             System.out.println("Displaying records from STUDENTS table, showing insert -----");
//             System.out.println("---------------------------");

//             ResultSet rs = stmt.executeQuery("select * from STUDENTS");
//             while (rs.next()) {
//                 System.out.println("id: " + rs.getInt(1));
//                 System.out.println("name: " + rs.getString(2));
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
// }
