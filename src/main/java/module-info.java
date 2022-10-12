module com.example.roanoke {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.roanoke to javafx.fxml;
    exports com.example.roanoke;
}