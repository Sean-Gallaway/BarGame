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
     * Creates a sprite object with the image located at the given path.
     * Scale is dictated in the X and Y direction with their given variables.
     * Defaults to not keeping the aspect ratio.
     * Defaults to not using smoothing.
     *
     * @param path   The relative path starting from the resources folder. example: "/dragon.png".
     * @param scaleX Scale of the resulting Sprite in the X direction.
     * @param scaleY Scale of the resulting Sprite in the Y direction.
     */
    public AnimatedSprite(String path, AnimationSets set, double scaleX, double scaleY) {
        super(path, scaleX, scaleY);
        imageNum = 0;
        images = set.getSetImages(0);
    }

    /**
     * Creates a sprite object with the image located at the given path.
     * Scale is dictated in the X and Y direction with their given variables.
     * Specify if ratio for scaling is preserved.
     * Defaults to not using smoothing.
     *
     * @param path          The relative path starting from the resources folder. example: "/dragon.png".
     * @param scaleX        Scale of the resulting Sprite in the X direction.
     * @param scaleY        Scale of the resulting Sprite in the Y direction.
     * @param preserveRatio Specifier if the aspect ratio of the Image should be kept.
     */
    public AnimatedSprite(String path, AnimationSets set, double scaleX, double scaleY, boolean preserveRatio) {
        super(path, scaleX, scaleY, preserveRatio);
        imageNum = 0;
        images = set.getSetImages(0);
    }

    /**
     * Creates a sprite object with the image located at the given path.
     * Scale is dictated in the X and Y direction with their given variables.
     * Specify if ratio for scaling is preserved.
     * Defaults to not using smoothing.
     *
     * @param path          The relative path starting from the resources folder. example: "/dragon.png".
     * @param scaleX        Scale of the resulting Sprite in the X direction.
     * @param scaleY        Scale of the resulting Sprite in the Y direction.
     * @param preserveRatio Specifier if the aspect ratio of the Image should be kept.
     * @param smooth        Specifier if smoothing is used on the Image or not.
     */
    public AnimatedSprite(String path, AnimationSets set, double scaleX, double scaleY, boolean preserveRatio, boolean smooth) {
        super(path, scaleX, scaleY, preserveRatio, smooth);
        imageNum = 0;
        images = set.getSetImages(0);
    }


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

    @Override
    public boolean endOfLoop() {
        return imageNum == images.length;
    }
}
