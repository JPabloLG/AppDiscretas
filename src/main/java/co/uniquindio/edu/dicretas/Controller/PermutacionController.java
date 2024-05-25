package co.uniquindio.edu.dicretas.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import co.uniquindio.edu.dicretas.Model.CalculadoraPermutacion;

public class PermutacionController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCalcularPermutacion;

    @FXML
    private Label txtAreaPermutacion;

    @FXML
    private TextField txtKPermutacion;

    @FXML
    private TextField txtNPermutacion;

    @FXML
    void calcularPermutacion(ActionEvent event) {
        CalculadoraPermutacion calculadoraPermutacion = new CalculadoraPermutacion();
        String n = txtNPermutacion.getText();
        int nConvertido = Integer.parseInt(n);
        String k = txtNPermutacion.getText();
        int kConvertido = Integer.parseInt(k);
        calculadoraPermutacion.setN((nConvertido));
        calculadoraPermutacion.setK(kConvertido);
        txtAreaPermutacion.setText(calculadoraPermutacion.toString());
    }

    @FXML
    void initialize() {
        assert btnCalcularPermutacion != null : "fx:id=\"btnCalcularPermutacion\" was not injected: check your FXML file 'Permutacion.fxml'.";
        assert txtAreaPermutacion != null : "fx:id=\"txtAreaPermutacion\" was not injected: check your FXML file 'Permutacion.fxml'.";
        assert txtKPermutacion != null : "fx:id=\"txtKPermutacion\" was not injected: check your FXML file 'Permutacion.fxml'.";
        assert txtNPermutacion != null : "fx:id=\"txtNPermutacion\" was not injected: check your FXML file 'Permutacion.fxml'.";

    }

}
