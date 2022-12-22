module com.example.cube {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cube to javafx.fxml;
    exports com.example.cube;
}