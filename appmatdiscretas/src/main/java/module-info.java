module co.uniquindio.edu.javafx.discretas {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.edu.javafx.discretas to javafx.fxml;
    exports co.uniquindio.edu.javafx.discretas;
}
