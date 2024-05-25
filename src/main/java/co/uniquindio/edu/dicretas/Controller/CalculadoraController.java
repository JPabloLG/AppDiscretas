package co.uniquindio.edu.dicretas.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class CalculadoraController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> comb;

    @FXML
    void Seleccionar(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert comb != null : "fx:id=\"comb\" was not injected: check your FXML file 'primary.fxml'.";

    }

}
