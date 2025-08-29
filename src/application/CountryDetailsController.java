package application;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CountryDetailsController {

    @FXML
    private VBox detailsBox;

    @FXML
    private Label countryFactsLabel;

    public void setCountryData(ExploreFactsController.Country country) {
        detailsBox.getChildren().clear();
        detailsBox.setAlignment(Pos.CENTER); 

        // 1. Add scenic image
        if (country.getScenicImagePath() != null) {
            Image scenicImage;
            try {
                scenicImage = new Image(getClass().getResourceAsStream(country.getScenicImagePath()));
            } catch (Exception e) {
                e.printStackTrace();
                scenicImage = new Image(getClass().getResourceAsStream("/application/flags/placeholder.png"));
            }

            ImageView imageView = new ImageView(scenicImage);
            imageView.setFitWidth(1200);
            //imageView.setFitHeight(900);// adjust as needed
            imageView.setPreserveRatio(true);
            imageView.setSmooth(true);
            detailsBox.getChildren().add(imageView);
        }

        // 2. Add facts
        for (String fact : country.getFacts()) {
            Label factLabel = new Label(fact);
            factLabel.setWrapText(true);
            factLabel.setStyle("-fx-font-size: 24px; -fx-padding: 10px;");
            detailsBox.getChildren().add(factLabel);
        }
    }
}
