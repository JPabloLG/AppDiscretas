module co.uniquindio.edu.dicretas {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.edu.dicretas to javafx.fxml;
    exports co.uniquindio.edu.dicretas;
}
