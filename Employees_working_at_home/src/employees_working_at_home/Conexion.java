package employees_working_at_home;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

      public static Connection conectar() {

        Connection conn = null;

        try {
            
Class.forName("org.postgresql.Driver");

            String url =
            "jdbc:postgresql://localhost:5432/Employees_working_at_home";

            String user = "postgres";

            String password = "admin";

            
            conn =
            DriverManager.getConnection(
                    url,
                    user,
                    password
            );
            
            conn.setAutoCommit(false);

            System.out.println("Successful connection");

        } catch(Exception e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }

        return conn;
    }
}