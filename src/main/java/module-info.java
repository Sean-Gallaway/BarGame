module com.example.bargame {
    requires javafx.controls;
    requires javafx.fxml;


    opens bargame to javafx.fxml;
    exports bargame;
    exports bargame.npc to javafx.fxml;
    exports bargame.Gui;
    opens bargame.Gui to javafx.fxml;
    exports bargame.Loop;
    opens bargame.Loop to javafx.fxml;
    exports bargame.Loop.Motion;
    opens bargame.Loop.Motion to javafx.fxml;
}