package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
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

        // Example country with flag and scenic image
        Country slovenia = new Country(
                "Slovenia",
                "/application/resources/flags/slovenia.png",       // small flag for card
                "/application/resources/images/slovenia3.png"     // scenic image for details
        );
        slovenia.addFact("Slovenia is known for its caves.");
        slovenia.addFact("It has beautiful mountains and lakes.");
        allCountries.add(slovenia);

        Country laos = new Country(
        	    "Laos",
        	    "/application/resources/flags/laos.png",
        	    "/application/resources/images/laos.png"
        	);
        	laos.addFact("Laos is a landlocked country in Southeast Asia.");
        	laos.addFact("It is known for mountainous terrain and the Mekong River.");
        	allCountries.add(laos);

        	Country samoa = new Country(
        	    "Samoa",
        	    "/application/resources/flags/samoa.png",
        	    "/application/resources/images/samoa.png"
        	);
        	samoa.addFact("Samoa is made up of two main islands.");
        	samoa.addFact("It is known for its beaches, volcanic landscapes, and tropical forests.");
        	allCountries.add(samoa);

        	Country kazakhstan = new Country(
        	    "Kazakhstan",
        	    "/application/resources/flags/kazakh.png",
        	    "/application/resources/images/kazakhstan.png"
        	);
        	kazakhstan.addFact("Kazakhstan is the world's largest landlocked country.");
        	kazakhstan.addFact("It has vast steppes and deserts.");
        	allCountries.add(kazakhstan);

        	Country eritrea = new Country(
        	    "Eritrea",
        	    "/application/resources/flags/erithria.png",
        	    "/application/resources/images/eritrea.png"
        	);
        	eritrea.addFact("Eritrea is in the Horn of Africa.");
        	eritrea.addFact("It has a Red Sea coastline.");
        	allCountries.add(eritrea);

        	Country estonia = new Country(
        	    "Estonia",
        	    "/application/resources/flags/estonia.png",
        	    "/application/resources/images/estonia.png"
        	);
        	estonia.addFact("Estonia is a Baltic country in Northern Europe.");
        	estonia.addFact("It has many islands and forests.");
        	allCountries.add(estonia);
        	
        	// Malta
        	Country malta = new Country(
        	    "Malta",
        	    "/application/resources/flags/malta.png",
        	    "/application/resources/images/malta.png"
        	);
        	malta.addFact("Malta is an island nation in the Mediterranean Sea.");
        	malta.addFact("It is known for historic sites and beautiful beaches.");
        	allCountries.add(malta);

        	// Tunisia
        	Country tunisia = new Country(
        	    "Tunisia",
        	    "/application/resources/flags/tunisia.png",
        	    "/application/resources/images/tunisia.png"
        	);
        	tunisia.addFact("Tunisia is in North Africa.");
        	tunisia.addFact("It is famous for its ancient ruins and Mediterranean beaches.");
        	allCountries.add(tunisia);

        	// Lesotho
        	Country lesotho = new Country(
        	    "Lesotho",
        	    "/application/resources/flags/leso.png",
        	    "/application/resources/images/lesotho.png"
        	);
        	lesotho.addFact("Lesotho is a high-altitude, landlocked country in Southern Africa.");
        	lesotho.addFact("It is completely surrounded by South Africa.");
        	allCountries.add(lesotho);

        	// Suriname
        	Country suriname = new Country(
        	    "Suriname",
        	    "/application/resources/flags/suri.png",
        	    "/application/resources/images/suriname.png"
        	);
        	suriname.addFact("Suriname is the smallest country in South America.");
        	suriname.addFact("It has a tropical rainforest and Dutch colonial architecture.");
        	allCountries.add(suriname);

        	// Botswana
        	Country botswana = new Country(
        	    "Botswana",
        	    "/application/resources/flags/Bots.png",
        	    "/application/resources/images/botswana.png"
        	);
        	botswana.addFact("Botswana is famous for wildlife and the Okavango Delta.");
        	botswana.addFact("It is one of the most stable countries in Africa.");
        	allCountries.add(botswana);

        	// Lithuania
        	Country lithuania = new Country(
        	    "Lithuania",
        	    "/application/resources/flags/Lithu.png",
        	    "/application/resources/images/lithuania.png"
        	);
        	lithuania.addFact("Lithuania is a Baltic country in Europe.");
        	lithuania.addFact("It has beautiful old towns and forests.");
        	allCountries.add(lithuania);

        	// Cameroon
        	Country cameroon = new Country(
        	    "Cameroon",
        	    "/application/resources/flags/cam.png",
        	    "/application/resources/images/cameroon.png"
        	);
        	cameroon.addFact("Cameroon is known as 'Africa in miniature'.");
        	cameroon.addFact("It has beaches, deserts, mountains, and rainforests.");
        	allCountries.add(cameroon);

        	// Nicaragua
        	Country nicaragua = new Country(
        	    "Nicaragua",
        	    "/application/resources/flags/nicara.png",
        	    "/application/resources/images/nicaragua.png"
        	);
        	nicaragua.addFact("Nicaragua is in Central America.");
        	nicaragua.addFact("It has lakes, volcanoes, and colonial cities.");
        	allCountries.add(nicaragua);

        	// Slovakia
        	Country slovakia = new Country(
        	    "Slovakia",
        	    "/application/resources/flags/Slovakia.png",
        	    "/application/resources/images/slovakia.png"
        	);
        	slovakia.addFact("Slovakia has many castles and mountains.");
        	slovakia.addFact("It is a landlocked country in Central Europe.");
        	allCountries.add(slovakia);

        	// Latvia
        	Country latvia = new Country(
        	    "Latvia",
        	    "/application/resources/flags/Latvia.png",
        	    "/application/resources/images/latvia.png"
        	);
        	latvia.addFact("Latvia is a Baltic country in Northern Europe.");
        	latvia.addFact("It has a beautiful coastline and historic cities.");
        	allCountries.add(latvia);

        	// Bhutan
        	Country bhutan = new Country(
        	    "Bhutan",
        	    "/application/resources/flags/Bhutan.png",
        	    "/application/resources/images/bhutan.png"
        	);
        	bhutan.addFact("Bhutan is a Himalayan kingdom.");
        	bhutan.addFact("It is known for monasteries and gross national happiness.");
        	allCountries.add(bhutan);

        	// Namibia
        	Country namibia = new Country(
        	    "Namibia",
        	    "/application/resources/flags/Namibia.png",
        	    "/application/resources/images/namibia.png"
        	);
        	namibia.addFact("Namibia has deserts and wildlife reserves.");
        	namibia.addFact("It is famous for the Namib Desert and Etosha National Park.");
        	allCountries.add(namibia);

        	// Belize
        	Country belize = new Country(
        	    "Belize",
        	    "/application/resources/flags/Belize.png",
        	    "/application/resources/images/belize.png"
        	);
        	belize.addFact("Belize has Caribbean coastline and coral reefs.");
        	belize.addFact("It is known for Mayan ruins and tropical forests.");
        	allCountries.add(belize);

        	// Albania
        	Country albania = new Country(
        	    "Albania",
        	    "/application/resources/flags/Albania.png",
        	    "/application/resources/images/albania.png"
        	);
        	albania.addFact("Albania is in Southeastern Europe.");
        	albania.addFact("It has mountains and a beautiful Adriatic coastline.");
        	allCountries.add(albania);

        	// Kyrgyzstan
        	Country kyrgyzstan = new Country(
        	    "Kyrgyzstan",
        	    "/application/resources/flags/Kyrgyzstan.png",
        	    "/application/resources/images/kyrgyzstan.png"
        	);
        	kyrgyzstan.addFact("Kyrgyzstan is a mountainous country in Central Asia.");
        	kyrgyzstan.addFact("It is known for alpine lakes and nomadic culture.");
        	allCountries.add(kyrgyzstan);

        	// Sierra Leone
        	Country sierraLeone = new Country(
        	    "Sierra Leone",
        	    "/application/resources/flags/sleon.png",
        	    "/application/resources/images/sierraleone.png"
        	);
        	sierraLeone.addFact("Sierra Leone has a tropical climate and coastline.");
        	sierraLeone.addFact("It is rich in wildlife and mineral resources.");
        	allCountries.add(sierraLeone);

        	// Afghanistan
        	Country afghanistan = new Country(
        	    "Afghanistan",
        	    "/application/resources/flags/afhgan.png",
        	    "/application/resources/images/afghanistan.png"
        	);
        	afghanistan.addFact("Afghanistan is mountainous and landlocked.");
        	afghanistan.addFact("It has a rich history of ancient civilizations.");
        	allCountries.add(afghanistan);

        	// Fiji
        	Country fiji = new Country(
        	    "Fiji",
        	    "/application/resources/flags/fiji.png",
        	    "/application/resources/images/fiji.png"
        	);
        	fiji.addFact("Fiji is an island country in the South Pacific.");
        	fiji.addFact("It is famous for coral reefs and tropical beaches.");
        	allCountries.add(fiji);

        	// Morocco
        	Country morocco = new Country(
        	    "Morocco",
        	    "/application/resources/flags/mrc.png",
        	    "/application/resources/images/morocco.png"
        	);
        	morocco.addFact("Morocco is in North Africa.");
        	morocco.addFact("It is famous for deserts, mountains, and vibrant markets.");
        	allCountries.add(morocco);

        	// Panama
        	Country panama = new Country(
        	    "Panama",
        	    "/application/resources/flags/pnama.png",
        	    "/application/resources/images/panama.png"
        	);
        	panama.addFact("Panama connects Central and South America.");
        	panama.addFact("It is famous for the Panama Canal.");
        	allCountries.add(panama);

        	// Andorra
        	Country andorra = new Country(
        	    "Andorra",
        	    "/application/resources/flags/andora.png",
        	    "/application/resources/images/andorra.png"
        	);
        	andorra.addFact("Andorra is a tiny country in the Pyrenees between France and Spain.");
        	andorra.addFact("It is known for skiing and tax-free shopping.");
        	allCountries.add(andorra);

        	// São Tomé and Príncipe
        	Country saotome = new Country(
        	    "São Tomé and Príncipe",
        	    "/application/resources/flags/sao.png",
        	    "/application/resources/images/saotome.png"
        	);
        	saotome.addFact("São Tomé and Príncipe is an island nation in the Gulf of Guinea.");
        	saotome.addFact("It is known for cocoa production and lush landscapes.");
        	allCountries.add(saotome);

        	// Kiribati
        	Country kiribati = new Country(
        	    "Kiribati",
        	    "/application/resources/flags/kiri.png",
        	    "/application/resources/images/kiribati.png"
        	);
        	kiribati.addFact("Kiribati is an island nation in the central Pacific Ocean.");
        	kiribati.addFact("It is known for atolls and marine biodiversity.");
        	allCountries.add(kiribati);

        	// Tajikistan
        	Country tajikistan = new Country(
        	    "Tajikistan",
        	    "/application/resources/flags/tzy.png",
        	    "/application/resources/images/tajikistan.png"
        	);
        	tajikistan.addFact("Tajikistan is mountainous and landlocked in Central Asia.");
        	tajikistan.addFact("It is known for hiking and historic Silk Road sites.");
        	allCountries.add(tajikistan);
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

        // Load flag
        Image flagImage;
        try {
            flagImage = new Image(getClass().getResourceAsStream(country.getFlagPath()));
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

    // Updated Country model
    public static class Country {
        private String name;
        private List<String> facts = new ArrayList<>();
        private String flagPath;       // for card
        private String scenicImagePath; // for details

        public Country(String name, String flagPath, String scenicImagePath) {
            this.name = name;
            this.flagPath = flagPath;
            this.scenicImagePath = scenicImagePath;
        }

        public void addFact(String fact) {
            if (fact != null) facts.add(fact);
        }

        public String getName() { return name; }
        public List<String> getFacts() { return facts; }
        public String getFlagPath() { return flagPath; }
        public String getScenicImagePath() { return scenicImagePath; }
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
            stage.setMaximized(true);
            stage.setTitle(country.getName());
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleBackToMainMenu(ActionEvent event) {
        try {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/MainMenu.fxml"));
            Parent root = loader.load();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Factrip - Main Menu");
            stage.setMaximized(true);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
