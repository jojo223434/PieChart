module com.example.piechart {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.piechart to javafx.fxml;
    exports com.example.piechart;
}