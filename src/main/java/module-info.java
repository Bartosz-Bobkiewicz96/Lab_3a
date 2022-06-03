module com.example.lab_6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.wsei.lublin.java.cwiczenia to javafx.fxml;
    exports pl.wsei.lublin.java.cwiczenia;
}