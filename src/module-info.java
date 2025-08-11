module factrip2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.datatype.jsr310;

    opens application to javafx.fxml, com.fasterxml.jackson.databind;

    exports application;
}