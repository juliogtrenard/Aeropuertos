module es.juliogtrenard.aeropuertos {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.juliogtrenard.aeropuertos to javafx.fxml;
    exports es.juliogtrenard.aeropuertos;
}