package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController {
	public void switchScene(Stage stage, String fxmlPath, String title) {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
	        Parent root = loader.load();
	        Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.setTitle(title);
	        stage.setMaximized(true); // maximize after setting scene
	        stage.show();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@FXML
	void handleExploreFacts(ActionEvent event) {
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    switchScene(stage, "/application/ExploreFacts.fxml", "Explore Fun Facts");
	}


    @FXML
    void handlePlanTrip(ActionEvent event) {
    	Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        switchScene(stage, "/application/planner.fxml", "Factrip - Trip Planner");
    }

    @FXML
    void handleMemoryEntry(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        switchScene(stage, "/application/memoryMain.fxml", "Memory Entry");
    }

}