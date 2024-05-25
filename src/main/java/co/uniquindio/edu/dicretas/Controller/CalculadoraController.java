package co.uniquindio.edu.dicretas.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CalculadoraController implements Initializable {

    @FXML
    private ComboBox<TipoOperacion> comb;

    @FXML
    void Seleccionar(ActionEvent event) {
        TipoOperacion operacionSeleccionada = comb.getSelectionModel().getSelectedItem();

        switch (operacionSeleccionada) {
            case PERMUTACION:
                mostrarVentana("src/main/resources/co/uniquindio/edu/dicretas/Permutacion.fxml");
                break;
            case VARIACIONES:
                mostrarVentana("Variaciones");
                break;
            case COMBINATORIA:
                mostrarVentana("Combinatoria");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<TipoOperacion> tiposOperacion = FXCollections.observableArrayList(TipoOperacion.values());
        comb.setItems(tiposOperacion);
        comb.getSelectionModel().selectFirst();
    }

    private void mostrarVentana(String tituloVentana) {
        Stage ventana = new Stage();
        ventana.initModality(Modality.APPLICATION_MODAL);
        ventana.initStyle(StageStyle.UNDECORATED);

      

        // TODO: Implementar la carga de la vista correspondiente a cada tipo de operación

        ventana.setTitle(tituloVentana);
        ventana.show();
   }

    public enum TipoOperacion {
        PERMUTACION,
        VARIACIONES,
        COMBINATORIA
    }
}