package bargame.Loop;


import bargame.App;
import javafx.scene.image.Image;

import java.util.Objects;

public enum AnimationSets {
    // rewrite some stuff in here, frame isn't accessible.
    dragonSet(new Set[]{
            Set.dragon
    });

    Set[] Sets;
    AnimationSets (Set[] Sets) {
        this.Sets = Sets;
    }

    /**
     * This method grabs all the Images contained by a specified set.
     *
     * @param setNumber
     * @return
     */
    public Image[] getSetImages (int setNumber) {
        return Sets[setNumber].getImages();
    }
}

enum Set {
    // all animation sets get placed into here. this enum may also be used for holding images that may or may not necessarily be animated.
    dragon("/dragonIdle/dragon_idle_", 13);

    Image[] images;
    Set(String path, int frameCount) {
        images = new Image[frameCount];
        for (int a = 0; a < frameCount; a++) {
            images[a] = createImageFromPath(path + (a+1) + ".png");
        }
    }

    /**
     * Returns the Images associated with this Set object.
     *
     * @return images
     */
    public Image[] getImages () {
        return images;
    }

    /**
     * Helper method that should probably be in a Tools.java class that i usually make or something.
     *
     * @param path  relative path to the Image starting from the Resource folder.
     * @return      the constructed Image.
     */
    public static Image createImageFromPath(String path) {
        return new Image(Objects.requireNonNull(App.class.getResourceAsStream(path)));
    }

    /**
     * Helper method that should probably be in a Tools.java class that i usually make or something.
     * Permutation where you can specify the size of the image if necessary.
     *
     * @param path  relative path to the Image starting from the Resource folder.
     * @param sizeX the width of the resultant image.
     * @param sizeY the height of the resultant image.
     * @return      the constructed Image.
     */
    public static Image createImageFromPath(String path, double sizeX, double sizeY) {
        return new Image(Objects.requireNonNull(App.class.getResourceAsStream(path)), sizeX, sizeY, false, false);
    }
}
