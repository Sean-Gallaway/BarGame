package bargame;

import bargame.Gui.*;
import bargame.Loop.AnimationSets;
import bargame.Loop.AnimationThread;
import bargame.Loop.FPS;
import bargame.Loop.Update;
import bargame.npc.Dialogue;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.util.ArrayList;

public class App extends Application {
    public static double width = Screen.getPrimary().getBounds().getWidth()/2.0;
    public static double height = Screen.getPrimary().getBounds().getHeight()/2.0;
    public static ArrayList<Thread> animationThreads = new ArrayList<>();
    public static Group worldScene = new Group();
    @Override
    public void start(Stage stage) {
        Pane p = new Pane();
        worldScene.getChildren().add(p);
        p.setMinSize(width, height);
//        p.setStyle("-fx-background-color: gray");

        Scene scene = new Scene(worldScene, width, height);
        stage.setTitle("Bar Game");
        stage.setScene(scene);
        stage.show();


        InteractibleAnimatedSprite ias = new InteractibleAnimatedSprite("/dragon.png", AnimationSets.DRAGON_SET, Dialogue.Dragon);
        worldScene.getChildren().add(ias);
//        AnchoredTextBox atb = new AnchoredTextBox(Dialogue.Dragon, "Calibri", 20, false, 200);
//        worldScene.getChildren().add(atb);

        AnimationThread at = new AnimationThread(new FPS[]{FPS.FIVE});
        at.addSubject(ias, FPS.FIVE);
        at.start();


        //AnchoredTextBox atb = new AnchoredTextBox("/dragon.png", d, "Calibri", 40, false, 175);
        //worldScene.getChildren().add(atb);

        //Update update = new Update(FPS.FIVE);
        //update.start();
    }

    /**
     * Overriding the stop method to be able to stop any additionally running threads.
     */
    @Override
    public void stop () {
        for (Thread t : animationThreads) {
            t.interrupt();
        }
        Platform.exit();
    }

    public static void main(String[] args) {
        launch();
    }
}