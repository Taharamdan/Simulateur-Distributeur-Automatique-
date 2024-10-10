import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VendingMachineUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Liste des produits
        ListView<String> productList = new ListView<>();
        productList.getItems().addAll(
            "Coca-Cola - 10.00 MAD",
            "Barre de Chocolat - 8.00 MAD",
            "Eau Minérale - 3.50 MAD"
        );

        // Champ pour saisir le montant
        TextField amountField = new TextField();
        amountField.setPromptText("Entrer le montant");

        // Bouton d'achat
        Button buyButton = new Button("Acheter");
        buyButton.setOnAction(e -> {
            String selectedProduct = productList.getSelectionModel().getSelectedItem();
            if (selectedProduct != null) {
                System.out.println("Produit acheté : " + selectedProduct);
            }
        });

        // Bouton annuler
        Button cancelButton = new Button("Annuler");
        cancelButton.setOnAction(e -> {
            productList.getSelectionModel().clearSelection();
            amountField.clear();
        });

        // Layout vertical
        VBox layout = new VBox(10);
        layout.getChildren().addAll(
            new Label("Produits disponibles :"),
            productList,
            new Label("Montant :"),
            amountField,
            buyButton,
            cancelButton
        );

        // Scene et stage
        Scene scene = new Scene(layout, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Vending Machine");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
