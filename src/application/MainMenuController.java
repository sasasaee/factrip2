package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController {
    
    @FXML
    private Button exploreFactsBtn;
    
    @FXML
    private Button planTripBtn;
    
    @FXML
    private Button memoryEntryBtn;
    
    @FXML
    void handleExploreFacts(ActionEvent event) {
        // TODO: Implement navigation to facts section
        System.out.println("Navigate to Explore Fun Facts");
    }
    
    @FXML
    void handlePlanTrip(ActionEvent event) {
        try {
            Parent plannerRoot = FXMLLoader.load(getClass().getResource("/application/planner.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(plannerRoot);
            stage.setScene(scene);
            stage.setTitle("Factrip - Trip Planner");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    void handleMemoryEntry(ActionEvent event) {
        // TODO: Implement navigation to memory entry section
        System.out.println("Navigate to Memory Entry");
    }
}

