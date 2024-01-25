package bargame;

import bargame.Gui.*;
import bargame.Loop.AnimationSets;
import bargame.Loop.AnimationThread;
import bargame.Loop.FPS;
import bargame.Loop.Update;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class App extends Application {
    public static double width = Screen.getPrimary().getBounds().getWidth()/2.0;
    public static double height = Screen.getPrimary().getBounds().getHeight()/2.0;

    @Override
    public void start(Stage stage) {
        Pane p = new Pane();
        p.setMinSize(width, height);
        p.setStyle("-fx-background-color: gray");
        Group g = new Group(p);
        Scene scene = new Scene(g, width, height);
        stage.setTitle("Bar Game");
        stage.setScene(scene);
        stage.show();

        Textbox textbox = new Textbox("Oi", "Calibri", 20);
        TimedTextbox timedTextbox = new TimedTextbox(g, 30, "boi", "Arial", 20);
        //g.getChildren().add(timedTextbox.getBox());


        //Sprite dragon = new Sprite("/dragon.png", 128, 128, true);
        AnimatedSprite dragon = new AnimatedSprite("/dragon.png", AnimationSets.dragonSet);
        g.getChildren().add(dragon);

        AnimatedSprite dragonTwo = new AnimatedSprite("/dragon.png", AnimationSets.dragonSet);
        g.getChildren().add(dragonTwo);
        dragonTwo.setLayoutX(200);

        AnimationThread at = new AnimationThread(new FPS[]{FPS.FIVE, FPS.SIXTY});
        at.addSubject(dragon, FPS.FIVE);
        at.addSubject(dragonTwo, FPS.SIXTY);
        at.start();
        at.interrupt();

        AnchoredTextBox atb = new AnchoredTextBox("/dragon.png", "Here is some text on the bottom of the screen for you! blah blah blah blah blah blah blah blah blah blah blah blah", "Calibri", 40, false, 175);
        g.getChildren().add(atb);

        Update update = new Update(FPS.FIVE);
        update.ttb = timedTextbox;
        update.start();
    }

    public static void main(String[] args) {
        launch();
    }
}