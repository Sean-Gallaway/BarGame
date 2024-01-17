package bargame;

import bargame.Gui.Sprite;
import bargame.Gui.Textbox;
import bargame.Gui.TimedTextbox;
import bargame.Loop.FPS;
import bargame.Loop.Update;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class App extends Application {
    double width = Screen.getPrimary().getBounds().getWidth()/2.0;
    double height = Screen.getPrimary().getBounds().getHeight()/2.0;

    @Override
    public void start(Stage stage) {
        Group g = new Group();
        Scene scene = new Scene(g, width, height);
        stage.setTitle("Bar Game");
        stage.setScene(scene);
        stage.show();

        Textbox textbox = new Textbox("Oi", "Calibri", 20);
        TimedTextbox timedTextbox = new TimedTextbox(g, 30, "boi", "Arial", 20);
        g.getChildren().add(timedTextbox.getAlert());

        Sprite dragon = new Sprite("/dragon.png");
        g.getChildren().add(dragon);

        Update update = new Update(FPS.FIVE);
        update.ttb = timedTextbox;
        update.start();
    }

    public static void main(String[] args) {
        launch();
    }
}