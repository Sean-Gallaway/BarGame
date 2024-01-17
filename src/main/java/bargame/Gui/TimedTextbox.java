package bargame.Gui;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class TimedTextbox extends Textbox {
    boolean loop;
    int timer;
    Node parent;

    /////
    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent   The Node that contains this object inside of it.
     * @param text     The text you want to be contained in the text box.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.*
     *                 Color of the text defaults to Black.
     *                 Color of the background defaults to Transparent.
     *                 Loop defaults to false
     *                 Timer default value is 5. however fast this is depends on how the user implements updates.
     */
    public TimedTextbox(Node parent, String text, String font, double textSize) {
        super(text, font, textSize);
        this.parent = parent;
        loop = false;
        timer = 5;
    }

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent   The Node that contains this object inside of it.
     * @param loop     If the textbox reappears after it disappears.
     * @param text     The text you want to be contained in the text box.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.*
     *                 Color of the text defaults to Black.
     *                 Color of the background defaults to Transparent.
     *                 Timer default value is 5. however fast this is depends on how the user implements updates.
     */
    public TimedTextbox(Node parent, boolean loop, String text, String font, double textSize) {
        super(text, font, textSize);
        this.loop = loop;
        this.parent = parent;
        timer = 5;
    }

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent   The Node that contains this object inside of it.
     * @param timer    The Amount of time that the timer object exists for. the speed of this timer decrementing is dependent on user implementation.
     * @param text     The text you want to be contained in the text box.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.
     *                 Color of the text defaults to Black.
     *                 Color of the background defaults to Transparent.
     *                 Loop defaults to false
     */
    public TimedTextbox(Node parent, int timer, String text, String font, double textSize) {
        super(text, font, textSize);
        this.parent = parent;
        this.timer = timer;
        loop = false;
    }

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent   The Node that contains this object inside of it.
     * @param timer    The Amount of time that the timer object exists for. the speed of this timer decrementing is dependent on user implementation.
     * @param loop     If the textbox reappears after it disappears.
     * @param text     The text you want to be contained in the text box.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.
     *                 Color of the text defaults to Black.
     *                 Color of the background defaults to Transparent.
     */
    public TimedTextbox(Node parent, boolean loop, int timer, String text, String font, double textSize) {
        super(text, font, textSize);
        this.parent = parent;
        this.timer = timer;
        this.loop = loop;
    }
    /////

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent    The Node that contains this object inside of it.
     * @param text      The text you want to be contained in the text box.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     *                  Color of the background defaults to Transparent.
     *                  Timer default value is 5. however fast this is depends on how the user implements updates.
     *                  Loop defaults to false
     */
    public TimedTextbox(Node parent, String text, String font, double textSize, Color textColor) {
        super(text, font, textSize, textColor);
        this.parent = parent;
        loop = false;
        timer = 5;
    }

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent    The Node that contains this object inside of it.
     * @param loop      If the textbox reappears after it disappears.
     * @param text      The text you want to be contained in the text box.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     *                  Color of the background defaults to Transparent.
     *                  Timer default value is 5. however fast this is depends on how the user implements updates.
     */
    public TimedTextbox(Node parent, boolean loop, String text, String font, double textSize, Color textColor) {
        super(text, font, textSize, textColor);
        this.loop = loop;
        this.parent = parent;
        timer = 5;
    }

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent   The Node that contains this object inside of it.
     * @param timer    The Amount of time that the timer object exists for. the speed of this timer decrementing is dependent on user implementation.
     * @param text     The text you want to be contained in the text box.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.
     *                 Color of the background defaults to Transparent.
     *                 Loop defaults to false
     */
    public TimedTextbox(Node parent, int timer, String text, String font, double textSize, Color textColor) {
        super(text, font, textSize, textColor);
        this.parent = parent;
        this.timer = timer;
        loop = false;
    }

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent   The Node that contains this object inside of it.
     * @param timer    The Amount of time that the timer object exists for. the speed of this timer decrementing is dependent on user implementation.
     * @param loop     If the textbox reappears after it disappears.
     * @param text     The text you want to be contained in the text box.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.
     *                 Color of the background defaults to Transparent.
     */
    public TimedTextbox(Node parent, boolean loop, int timer, String text, String font, double textSize, Color textColor) {
        super(text, font, textSize, textColor);
        this.parent = parent;
        this.timer = timer;
        this.loop = loop;
    }


    /////
    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent    The Node that contains this object inside of it.
     * @param text      The text you want to be contained in the text box.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     * @param bgColor   Sets the background color of the textbox.
     *                  Timer default value is 5. however fast this is depends on how the user implements updates.
     *                  Loop defaults to false
     */
    public TimedTextbox(Node parent, String text, String font, double textSize, Color textColor, Color bgColor) {
        super(text, font, textSize, textColor, bgColor);
        this.parent = parent;
        loop = false;
        timer = 5;
    }

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent    The Node that contains this object inside of it.
     * @param loop      If the textbox reappears after it disappears.
     * @param text      The text you want to be contained in the text box.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     * @param bgColor   Sets the background color of the textbox.
     *                  Timer default value is 5. however fast this is depends on how the user implements updates.
     */
    public TimedTextbox(Node parent, boolean loop, String text, String font, double textSize, Color textColor, Color bgColor) {
        super(text, font, textSize, textColor, bgColor);
        this.loop = loop;
        this.parent = parent;
        timer = 5;
    }

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent   The Node that contains this object inside of it.
     * @param timer    The Amount of time that the timer object exists for. the speed of this timer decrementing is dependent on user implementation.
     * @param text     The text you want to be contained in the text box.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.
     * @param bgColor  Sets the background color of the textbox.
     *                 Loop defaults to false
     */
    public TimedTextbox(Node parent, int timer, String text, String font, double textSize, Color textColor, Color bgColor) {
        super(text, font, textSize, textColor, bgColor);
        this.parent = parent;
        this.timer = timer;
        loop = false;
    }

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     * be aware: parent reference is stored on creation, but does not check if this Object is apart of that Nodes children list.
     *
     * @param parent   The Node that contains this object inside of it.
     * @param timer    The Amount of time that the timer object exists for. the speed of this timer decrementing is dependent on user implementation.
     * @param loop     If the textbox reappears after it disappears.
     * @param text     The text you want to be contained in the text box.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.
     * @param bgColor  Sets the background color of the textbox.
     */
    public TimedTextbox(Node parent, boolean loop, int timer, String text, String font, double textSize, Color textColor, Color bgColor) {
        super(text, font, textSize, textColor, bgColor);
        this.parent = parent;
        this.timer = timer;
        this.loop = loop;
    }

    public void decrement () {
        timer--;
        if (timer == 0) {
            destruct();
        }
    }

    public void decrementBy (int val) {
        timer -= val;
        if (timer <= 0) {
            destruct();
        }
    }

    public void destruct () {
        if (parent instanceof Pane) {
            ((Pane) parent).getChildren().remove(this.l);
        }

        if (parent instanceof Group) {
            ((Group) parent).getChildren().remove(this.l);
        }
    }

    public void reassignParent (Node parent) {
        this.parent = parent;
    }

    @Override
    public String toString () {
        return "oi";
    }
}
