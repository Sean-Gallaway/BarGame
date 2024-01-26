package bargame.Gui;

import bargame.App;
import bargame.Loop.AnimationSets;
import bargame.npc.Dialogue;

public class InteractibleAnimatedSprite extends AnimatedSprite{
    boolean chatOpen = false;
    Dialogue d;
    AnchoredTextBox atb;
    String portraitPath;


    /**
     * Creates an interactive sprite object with the image located at the given path.
     * defaults to the scale of the given image.
     *
     * @param spritePath The relative path starting from the resources folder for the world sprite. example: "/dragon.png"
     * @param portraitPath The relative path starting from the resources folder for the textbox. example: "/dragon.png"
     * @param set  The animation set we are going to be iterating through when animate() is called.
     */
    public InteractibleAnimatedSprite(String spritePath, String portraitPath, AnimationSets set) {
        super(spritePath, set);
        createAnchored(portraitPath);
        setBehavior();
    }

    /**
     * Creates a sprite object with the initial image of the first image in a given image set.
     *
     * @param portraitPath The relative path starting from the resources folder for the textbox. example: "/dragon.png"
     * @param set The animation set we are going to be iterating through when animate() is called.
     */
    public InteractibleAnimatedSprite(String portraitPath, AnimationSets set) {
        super(set);
        createAnchored(portraitPath);
        setBehavior();
    }

    /**
     * Creates an interactive sprite object with the image located at the given path.
     * defaults to the scale of the given image.
     *
     * @param path The relative path starting from the resources folder for the world sprite. example: "/dragon.png"
     * @param portraitPath The relative path starting from the resources folder for the textbox. example: "/dragon.png"
     * @param set  The animation set we are going to be iterating through when animate() is called.
     * @param dialogue the dialogue set.
     */
    public InteractibleAnimatedSprite(String path, String portraitPath, AnimationSets set, Dialogue dialogue) {
        super(path, set);
        d = dialogue;
        createAnchored(portraitPath);
        setBehavior();
    }

    /**
     * Creates a sprite object with the initial image of the first image in a given image set.
     *
     * @param portraitPath The relative path starting from the resources folder for the textbox. example: "/dragon.png"
     * @param set The animation set we are going to be iterating through when animate() is called.
     * @param dialogue the dialogue set.
     */
    public InteractibleAnimatedSprite(String portraitPath, AnimationSets set, Dialogue dialogue) {
        super(set);
        d = dialogue;
        createAnchored(portraitPath);
        setBehavior();
    }

    private void createAnchored (String portraitPath) {
        this.portraitPath = portraitPath;
        atb = new AnchoredTextBox(portraitPath, Dialogue.Dragon, "Calibri", 20, false, 200);
    }

    private void setBehavior () {
        this.setOnMouseClicked(Event -> {
            if (!App.worldScene.getChildren().contains(atb)) {
                chatOpen = false;
            }
            if (!chatOpen) {
                chatOpen = true;
                //createAnchored(portraitPath);
                App.worldScene.getChildren().add(atb);
            }
        });
    }


}
