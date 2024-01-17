module com.example.bargame {
    requires javafx.controls;
    requires javafx.fxml;


    opens bargame to javafx.fxml;
    exports bargame;
    exports bargame.Gui;
    opens bargame.Gui to javafx.fxml;
    exports bargame.Loop;
    opens bargame.Loop to javafx.fxml;
}