package bargame.Loop;

import bargame.Gui.TimedTextbox;
import javafx.animation.AnimationTimer;

public class Update extends AnimationTimer {
    long lastUpdate, frameSize;
    public TimedTextbox ttb;

    /** Creates an Animation Timer.
     *
     * @param frameSize how long between frames in nanoseconds.
     *
     */
    public Update(FPS frameSize) {
        this.frameSize = frameSize.getValue();
    }

    @Override
    public void handle (long now) {
        if (now - lastUpdate >= frameSize) {
            ttb.decrement();

            lastUpdate = now;
        }
    }
}
