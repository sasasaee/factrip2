package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController {

    @FXML
    void handleExploreFacts(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/application/ExploreFacts.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Explore Fun Facts");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handlePlanTrip(ActionEvent event) {
        // TODO: Implement when your trip planning feature is ready
        System.out.println("Plan Trip clicked");
    }

    @FXML
    void handleMemoryEntry(ActionEvent event) {
        // TODO: Implement when your memory entry feature is ready
        System.out.println("Memory Entry clicked");
    }
}
