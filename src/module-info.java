module factrip2 {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;

    opens application to javafx.fxml;

    exports application;
}