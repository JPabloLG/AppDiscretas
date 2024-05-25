module co.uniquindio.edu.dicretas {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.edu.dicretas to javafx.fxml;
    exports co.uniquindio.edu.dicretas;

    opens co.uniquindio.edu.dicretas.Controller;
    exports co.uniquindio.edu.dicretas.Controller;

    opens co.uniquindio.edu.dicretas.Model;
    exports co.uniquindio.edu.dicretas.Model;
}
