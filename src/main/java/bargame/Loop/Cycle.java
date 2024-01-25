package bargame.Loop;

import bargame.Gui.Animated;
import javafx.animation.AnimationTimer;
import java.util.ArrayList;

public class Cycle extends AnimationTimer {
    private long lastUpdate;
    private final long framerate;
    private boolean loop = true, running;
    private ArrayList<Animated> subjects = new ArrayList<>();
    private final FPS fps;

    /**
     * Handler for creating an animation cycle for a sprite.
     *
     */
    public Cycle (FPS fps) {
        lastUpdate = 0;
        this.fps = fps;
        running = false;
        framerate = fps.getValue();
    }

    /**
     * Handler for creating an animation cycle for a sprite.
     *
     */
    public Cycle (FPS fps, boolean loop) {
        lastUpdate = 0;
        this.fps = fps;
        this.loop = loop;
        running = false;
        framerate = fps.getValue();
    }

    @Override
    public void start () {
        super.start();
        running = true;
    }

    @Override
    public void stop () {
        super.stop();
        running = false;
    }

    @Override
    public void handle(long now) {
        if (now - lastUpdate >= framerate) {
            for (int a = 0; a < subjects.size(); a++) {
                if (subjects.get(a).endOfLoop() && !loop) {
                    subjects.remove(subjects.get(a));
                }
                else {
                    subjects.get(a).animate();
                }
            }
            lastUpdate = now;
        }
    }

    public boolean isRunning() {
        return running;
    }

    public FPS getFPS () {
        return fps;
    }

    public void addSubject (Animated animated) {
        subjects.add(animated);
    }

    public void removeSubject (Animated animated) {
        subjects.remove(animated);
    }
}
