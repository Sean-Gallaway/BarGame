package bargame.Loop;

import javafx.scene.image.Image;

public interface AnimationControls {
    Image getImage(int index);
    int getFrameCount();
    Image[] getFrames();
}
