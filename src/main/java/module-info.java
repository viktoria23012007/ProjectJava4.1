module com.example.main4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.main4 to javafx.fxml;
    exports com.example.main4;
}