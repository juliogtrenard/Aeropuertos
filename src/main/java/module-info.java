module es.juliogtrenard.aeropuertos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens es.juliogtrenard.aeropuertos to javafx.fxml;
    exports es.juliogtrenard.aeropuertos;
}