import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/vending_machine"; // Change "vending_machine" par le nom de ta base de données
    private static final String USER = "postgres"; // Ton utilisateur PostgreSQL
    private static final String PASSWORD = "Taha-123"; // Ton mot de passe PostgreSQL

    // Méthode pour obtenir la connexion
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Charger le driver JDBC pour PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Etablir la connexion avec la base de données
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            if (connection != null) {
                System.out.println("Connexion réussie à la base de données !");
            } else {
                System.out.println("Échec de la connexion.");
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion à la base de données.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver PostgreSQL non trouvé.");
            e.printStackTrace();
        }

        return connection;
    }
}
