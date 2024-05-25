package co.uniquindio.edu.dicretas.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.uniquindio.edu.dicretas.Model.CalculadoraCombinatoria;
import co.uniquindio.edu.dicretas.Model.CalculadoraVariaciones;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class VariacionesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnCalcularVariaciones;

    @FXML
    private Label txtAraeVariaciones;

    @FXML
    private TextField txtKVariaciones;

    @FXML
    private TextField txtNVariaciones;

    @FXML
    void calcularVariaciones(ActionEvent event) {
        CalculadoraVariaciones calculadoraVariaciones = new CalculadoraVariaciones();
        String n = txtNVariaciones.getText();
        int nConvertido = Integer.parseInt(n);
        String k = txtKVariaciones.getText();
        int kConvertido = Integer.parseInt(k);
        calculadoraVariaciones.setN((nConvertido));
        calculadoraVariaciones.setK((kConvertido));
        txtAraeVariaciones.setText(calculadoraVariaciones.toString());
    }

    @FXML
    void initialize() {
        assert btnCalcularVariaciones != null : "fx:id=\"btnCalcularVariaciones\" was not injected: check your FXML file 'Variaciones.fxml'.";
        assert txtAraeVariaciones != null : "fx:id=\"txtAraeVariaciones\" was not injected: check your FXML file 'Variaciones.fxml'.";
        assert txtKVariaciones != null : "fx:id=\"txtKVariaciones\" was not injected: check your FXML file 'Variaciones.fxml'.";
        assert txtNVariaciones != null : "fx:id=\"txtNVariaciones\" was not injected: check your FXML file 'Variaciones.fxml'.";

    }

}
