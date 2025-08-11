package application;

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

    @FXML
    void handleStartPlanning(ActionEvent event) {
    	try {
    		Parent menuroot= FXMLLoader.load(getClass().getResource("/application/mainmenu.fxml"));
    		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(menuroot);
            stage.setScene(scene);
            stage.setTitle("Factrip - Main Menu");
            stage.show();
    	} catch (Exception e) {
            e.printStackTrace();
        }
    }
}