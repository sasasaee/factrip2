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
<<<<<<< HEAD
import javafx.stage.StageStyle;
import javafx.scene.control.Button;
import javafx.application.HostServices;
=======
>>>>>>> b4ff6e6496b1dc383f1c55d120751b8913aecb67

public class MainMenuController {
    private HostServices hostServices;

    public void setHostServices(HostServices hostServices) {
        this.hostServices = hostServices;
    }

<<<<<<< HEAD
	        FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/ExploreFacts.fxml"));
	        Parent root = loader.load();

	        // Pass hostServices to ExploreFactsController
	        ExploreFactsController controller = loader.getController();
	        controller.setHostServices(hostServices);

	        Scene scene = new Scene(root);
	        scene.setCursor(Cursor.HAND);
	        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

	        stage.setScene(scene);
	        stage.setTitle("Explore Fun Facts");
	        stage.setMaximized(true);
	        stage.show();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

    @FXML
    void handlePlanTrip(ActionEvent event) {
    	 try {
             FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/planner.fxml"));
             Parent root = loader.load();

             Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
             stage.setTitle("Plan your trip");
             stage.setScene(new Scene(root));
             stage.show();
         } catch (Exception e) {
             e.printStackTrace();
         }
     }

    @FXML private Button memoEntry;

    @FXML
    private void handleMemoryEntry(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/memoryMain.fxml"));
=======
    public void switchScene(Stage stage, String fxmlPath, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
>>>>>>> b4ff6e6496b1dc383f1c55d120751b8913aecb67
            Parent root = loader.load();

            // Ensure the stage is maximized before setting the new scene
            stage.setMaximized(true);

            // Get current maximized dimensions from the stage AFTER maximizing
            double width = stage.getWidth();
            double height = stage.getHeight();

            Scene scene = new Scene(root, width, height);

            // Apply common styles and cursor
            scene.setCursor(Cursor.HAND);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
<<<<<<< HEAD
=======

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
>>>>>>> b4ff6e6496b1dc383f1c55d120751b8913aecb67
}
