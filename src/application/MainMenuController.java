package application;

import javafx.application.HostServices;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController {
	private HostServices hostServices;

    public void setHostServices(HostServices hostServices) {
        this.hostServices = hostServices;
    }

	public void switchScene(Stage stage, String fxmlPath, String title) {
	    try {
	        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
	        Parent root = loader.load();
	        
	        // Ensure the stage is maximized before setting the new scene
	        stage.setMaximized(true);
	        
	        // Get current maximized dimensions from the stage AFTER maximizing
	        double width = stage.getWidth();
	        double height = stage.getHeight();
	        
	        Scene scene = new Scene(root, width, height);
	        
	        // Apply common styles and cursor from teammate's changes
	        scene.setCursor(Cursor.HAND);
	        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

	        stage.setScene(scene);
	        stage.setTitle(title);
	        stage.show();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	@FXML
	void handleExploreFacts(ActionEvent event) {
	    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	    // The teammate's code directly loaded FXML and set hostServices.
	    // To avoid duplicating FXML loading logic and maintain consistency with switchScene,
	    // we will call switchScene and assume hostServices is handled elsewhere if needed for ExploreFactsController.
	    // If ExploreFactsController *must* receive hostServices directly, the switchScene method would need to be refactored.
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