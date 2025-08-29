package application;

import javafx.application.Platform;
import javafx.event.ActionEvent; //handles button clicks or other actions
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Homecontroller {
    @FXML
    private Button startPlanningButton;
    private void switchScene(Stage stage, String fxmlPath, String title) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setMaximized(true);             // keep maximized
            stage.setFullScreenExitHint("");      // optional
            //stage.setFullScreen(true);          // optional full screen
            stage.setTitle(title);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    void handleStartPlanning(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        switchScene(stage, "/application/mainmenu.fxml", "Factrip - Main Menu");
    }
}