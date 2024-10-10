import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/vending_machine"; // Change "vending_machine" par le nom de ta base
        String user = "postgres"; // Ton utilisateur PostgreSQL
        String password = "Taha-123"; // Ton mot de passe PostgreSQL

        try {
            // Essayer de se connecter à PostgreSQL
            Connection conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Connexion réussie à la base de données !");
            } else {
                System.out.println("Échec de la connexion.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
