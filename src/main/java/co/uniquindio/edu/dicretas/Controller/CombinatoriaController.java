package co.uniquindio.edu.dicretas.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CombinatoriaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCalcularCombinatoria;

    @FXML
    private Label txtAreaCombinatoria;

    @FXML
    private TextField txtKCombinatoria;

    @FXML
    private TextField txtNCombinatoria;

    @FXML
    void calcularCombinatoria(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert btnCalcularCombinatoria != null : "fx:id=\"btnCalcularCombinatoria\" was not injected: check your FXML file 'Combinatoria.fxml'.";
        assert txtAreaCombinatoria != null : "fx:id=\"txtAreaCombinatoria\" was not injected: check your FXML file 'Combinatoria.fxml'.";
        assert txtKCombinatoria != null : "fx:id=\"txtKCombinatoria\" was not injected: check your FXML file 'Combinatoria.fxml'.";
        assert txtNCombinatoria != null : "fx:id=\"txtNCombinatoria\" was not injected: check your FXML file 'Combinatoria.fxml'.";

    }

}
