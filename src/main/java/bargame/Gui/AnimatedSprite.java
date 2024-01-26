package bargame.Gui;

import bargame.Loop.AnimationSets;
import javafx.scene.image.Image;

public class AnimatedSprite extends Sprite implements Animated {
    int imageNum;
    Image[] images;

    /**
     * Creates a sprite object with the image located at the given path.
     * defaults to the scale of the given image.
     *
     * @param path The relative path starting from the resources folder. example: "/dragon.png"
     * @param set   The animation set we are going to be iterating through when animate() is called.
     */
    public AnimatedSprite(String path, AnimationSets set) {
        super(path);
        imageNum = 0;
        images = set.getSetImages(0);
    }

    /**
     * Creates a sprite object with the initial image of the first image in a given image set.
     *
     * @param set   The animation set we are going to be iterating through when animate() is called.
     */
    public AnimatedSprite(AnimationSets set) {
        super(set.getSetImages(0)[0]);
        imageNum = 0;
        images = set.getSetImages(0);
    }

    /**
     * Override of the animate method inherited from the Animated interface. each time it is called it will set Image of this AnimatedSprite to the next Image in the animation set.
     *
     */
    @Override
    public void animate () {
        if (imageNum < images.length) {
            setImage(images[imageNum]);
            imageNum++;
        }
        else {
            imageNum = 0;
        }
    }

    /**
     * Checks if we have reached the end of our animation.
     *
     * @return self-explanatory
     */
    @Override
    public boolean endOfLoop() {
        return imageNum == images.length;
    }
}
