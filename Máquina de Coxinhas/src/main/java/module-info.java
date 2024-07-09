module com.example.estoque {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.estoque to javafx.fxml;
    exports com.example.estoque;
}