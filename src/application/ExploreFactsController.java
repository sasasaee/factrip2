package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExploreFactsController {

    @FXML private TextField searchField;
    @FXML private TilePane countryTilePane;

    private List<Country> allCountries = new ArrayList<>();

    @FXML
    public void initialize() {
        // Example countries (you can add more)
    	allCountries.add(new Country("Slovenia", "Slovenia is known for its caves.", "/application/resources/flags/slovenia.png"));
    	/*allCountries.add(new Country("Laos", "/application/resources/flags/laos.png"));
        allCountries.add(new Country("Samoa", "/application/resources/flags/samoa.png"));
        allCountries.add(new Country("Kazakhstan", "/application/resources/flags/kazakh.png"));
        allCountries.add(new Country("Erithria", "/application/resources/flags/erithria.png"));
        allCountries.add(new Country("Estonia", "/application/resources/flags/estonia.png"));
        allCountries.add(new Country("Malta", "/application/resources/flags/malta.png"));
        allCountries.add(new Country("Tunisia", "/application/resources/flags/tunisia.png"));
        allCountries.add(new Country("Lesotho", "/application/resources/flags/leso.png"));
        allCountries.add(new Country("Suriname", "/application/resources/flags/suri.png"));
        allCountries.add(new Country("Botswana", "/application/resources/flags/Bots.png"));
        allCountries.add(new Country("Lithuania", "/application/resources/flags/Lithu.png"));
        allCountries.add(new Country("Cameroon", "/application/resources/flags/cam.png"));
        allCountries.add(new Country("Nicaragua\r\n"
        		+ "", "/application/resources/flags/nicara.png"));
        allCountries.add(new Country("Slovakia", "/application/resources/flags/Slovakia.png"));
        allCountries.add(new Country("Latvia", "/application/resources/flags/Latvia.png"));
        allCountries.add(new Country("Bhutan", "/application/resources/flags/Bhutan.png"));
        allCountries.add(new Country("Namibia", "/application/resources/flags/Namibia.png"));
        allCountries.add(new Country("Belize", "/application/resources/flags/Belize.png"));
        allCountries.add(new Country("Albania", "/application/resources/flags/Albania.png"));
        allCountries.add(new Country("Kyrgystan", "/application/resources/flags/Kyrgyzstan.png"));
        allCountries.add(new Country("Sierra Leone", "/application/resources/flags/sleon.png"));
        allCountries.add(new Country("Afghanistan", "/application/resources/flags/afhgan.png"));
        allCountries.add(new Country("Fiji", "/application/resources/flags/fiji.png"));
        allCountries.add(new Country("Morocco", "/application/resources/flags/mrc.png"));
        allCountries.add(new Country("Panama", "/application/resources/flags/pnama.png"));
        allCountries.add(new Country("Andora", "/application/resources/flags/andora.png"));
        allCountries.add(new Country("são tomé and príncipe", "/application/resources/flags/sao.png"));
        allCountries.add(new Country("Kiribati", "/application/resources/flags/kiri.png"));
        allCountries.add(new Country("Tajikistan", "/application/resources/flags/tzy.png"));
        //allCountries.add(new Country("Andora", "/application/resources/flags/andora.png"));
        //allCountries.add(new Country("são tomé and príncipe", "/application/resources/flags/sao.png"));*/

        displayCountries(allCountries);

        // Enable search
        searchField.textProperty().addListener((obs, oldVal, newVal) -> {
            List<Country> filtered = allCountries.stream()
                    .filter(c -> c.getName().toLowerCase().contains(newVal.toLowerCase()))
                    .collect(Collectors.toList());
            displayCountries(filtered);
        });
    }
    

    private void displayCountries(List<Country> countries) {
        countryTilePane.getChildren().clear();
        for (Country country : countries) {
            Pane card = createCountryCard(country);
            countryTilePane.getChildren().add(card);
        }
    }

    private Pane createCountryCard(Country country) {
        Pane pane = new Pane();
        pane.setPrefSize(300, 200);

        Image flagImage;
        try {
            flagImage = new Image(getClass().getResourceAsStream(country.getFlagPath()));
            if (flagImage.isError()) throw new Exception();
        } catch (Exception e) {
            System.out.println("Image not found: " + country.getFlagPath());
            flagImage = new Image(getClass().getResourceAsStream("/application/flags/placeholder.png"));
        }

        ImageView flag = new ImageView(flagImage);
        flag.setFitWidth(300);
        flag.setFitHeight(150);
        flag.setPreserveRatio(true);

        Label name = new Label(country.getName());
        name.setLayoutX(100);
        name.setLayoutY(160);

        pane.getChildren().addAll(flag, name);

        pane.setOnMouseClicked(e -> openCountryDetails(country));

        return pane;
    }


    // Country model
    public static class Country {
        private String name;
        private String fact;
        private String flagPath;

        public Country(String name, String fact, String flagPath) {
            this.name = name;
            this.fact = fact;
            this.flagPath = flagPath;
        }

        public String getName() { return name; }
        public String getFact() { return fact; }
        public String getFlagPath() { return flagPath; }
    }

    @FXML
    private void openCountryDetails(Country country) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/CountryDetails.fxml"));
            Parent root = loader.load();

            // Pass selected country to details controller
            CountryDetailsController controller = loader.getController();
            controller.setCountryData(country);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(country.getName());
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
