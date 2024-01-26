package bargame.Gui;

import bargame.App;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class Sprite extends ImageView {

    /**
     * Creates a sprite object with the image located at the given path.
     * defaults to the scale of the given image.
     *
     * @param path          The relative path starting from the resources folder. example: "/dragon.png"
     */
    public Sprite (String path) {
        setImage(new Image(Objects.requireNonNull(App.class.getResourceAsStream(path))));
    }

    /**
     * Creates a sprite object with the given image. used primarily by the AnimatedSprite class.
     *
     * @param img          The given Image for this Sprite.
     */
    public Sprite (Image img) {
        setImage(img);
    }

    /**
     * Creates a sprite object with the image located at the given path.
     * Scale is dictated in the X and Y direction with their given variables.
     * Defaults to not keeping the aspect ratio.
     * Defaults to not using smoothing.
     *
     * @param path          The relative path starting from the resources folder. example: "/dragon.png".
     * @param scaleX        Scale of the resulting Sprite in the X direction.
     * @param scaleY        Scale of the resulting Sprite in the Y direction.
     */
    public Sprite (String path, double scaleX, double scaleY) {
        setImage(new Image(Objects.requireNonNull(App.class.getResourceAsStream(path)), scaleX, scaleY, false, false));
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
    public Sprite (String path, double scaleX, double scaleY, boolean preserveRatio) {
        setImage(new Image(Objects.requireNonNull(App.class.getResourceAsStream(path)), scaleX, scaleY, preserveRatio, false));
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
    public Sprite (String path, double scaleX, double scaleY, boolean preserveRatio, boolean smooth) {
        setImage(new Image(Objects.requireNonNull(App.class.getResourceAsStream(path)), scaleX, scaleY, preserveRatio, smooth));
    }
}
