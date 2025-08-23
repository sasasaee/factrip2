package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;
import application.ExploreFactsController.Country;
import javafx.event.ActionEvent;

public class CountryDetailsController {

    //@FXML
    //private Label countryNameLabel;

    @FXML
    private Label countryFactsLabel;

    @FXML
    private ImageView countryImageView;

    // This method sets the data dynamically
    public void setCountryData(Country country) {
        //countryNameLabel.setText(country.getName());
        countryFactsLabel.setText(country.getFact());
        //countryImageView.setImage(new Image(country.getImagePath()));
    }

    @FXML
    void handleBack(ActionEvent event) {
        // Close current details window
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
