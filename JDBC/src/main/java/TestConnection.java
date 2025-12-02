import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/jdbc";
        String user = "postgres";
        String password = "*******";

        try (
            Connection con = DriverManager.getConnection(url, user, password)){
            System.out.println("Connected !");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
