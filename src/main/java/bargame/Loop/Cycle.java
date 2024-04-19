package bargame.Loop;

import bargame.Gui.Animated;
import javafx.animation.AnimationTimer;
import java.util.ArrayList;

public class Cycle extends AnimationTimer {
    private long lastUpdate;
    private final long frameRate;
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
        frameRate = fps.getValue();
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
        frameRate = fps.getValue();
    }

    /**
     * Override of the start method to include setting running to true.
     *
     */
    @Override
    public void start () {
        super.start();
        running = true;
    }

    /**
     * Override of the stop method to include setting running to false.
     *
     */
    @Override
    public void stop () {
        super.stop();
        running = false;
    }

    /**
     * Override of the handle method. during the specified frame rate, loop over the subjects of this Cycle object and call the animate method.
     *
     * @param now
     *            The timestamp of the current frame given in nanoseconds. This
     *            value will be the same for all {@code AnimationTimers} called
     *            during one frame.
     */
    @Override
    public void handle(long now) {
        if (now - lastUpdate >= frameRate) {
            if (subjects.isEmpty()) {
                stop();
            }
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

    /**
     * Gets the running state of this Cycle Object
     *
     * @return state of the object
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Gets the targeted FPS that this Cycle object will run at.
     *
     * @return FPS of this animation cycle.
     */
    public FPS getFPS () {
        return fps;
    }

    /**
     * Adds an object to the subjects group, which will have their animate() method called each frame.
     *
     * @param animated  Animation object to be added to the subjects list.
     */
    public void addSubject (Animated animated) {
        subjects.add(animated);
    }

    /**
     * Removes an object from the subjects group.
     *
     * @param animated  Animation object to be removed from the subjects list.
     */
    public void removeSubject (Animated animated) {
        subjects.remove(animated);
    }
}
