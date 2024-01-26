package bargame.Gui;

import bargame.App;
import bargame.npc.Dialogue;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.util.Objects;

public class AnchoredTextBox extends FlowPane {
    Textbox tb;
    ImageView portrait;
    int progression = 0;
    String text, font, portraitPath;
    double textSize;
    Color bgColor, textColor;
    HBox hbox;

    ////
    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text     The text you want to be contained in the text box.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.*
     *                 Color of the text defaults to Black.
     *                 Color of the background defaults to Transparent.
     */
    public AnchoredTextBox(String text, String font, double textSize, boolean top, double height) {
        createPortraitless(text, font, textSize, Color.BLACK, Color.TRANSPARENT, height, top);
    }

    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text     The Dialogue object we are going to get our text from. it will grab the first string from the first set.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.*
     *                 Color of the text defaults to Black.
     *                 Color of the background defaults to Transparent.
     */
    public AnchoredTextBox(Dialogue text, String font, double textSize, boolean top, double height) {
        createPortraitless(Objects.requireNonNull(text.getDialogue(progression))[0], font, textSize, Color.BLACK, Color.TRANSPARENT, height, top);
        tb.dialogue = text.getDialogue(progression);
    }
    ////
    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text      The text you want to be contained in the text box.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     *                  Color of the background defaults to Transparent.
     */
    public AnchoredTextBox(String text, String font, double textSize, Color textColor, boolean top, double height) {
        createPortraitless(text, font, textSize, textColor, Color.TRANSPARENT, height, top);
    }

    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text      The Dialogue object we are going to get our text from. it will grab the first string from the first set.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     *                  Color of the background defaults to Transparent.
     */
    public AnchoredTextBox(Dialogue text, String font, double textSize, Color textColor, boolean top, double height) {
        createPortraitless(Objects.requireNonNull(text.getDialogue(progression))[0], font, textSize, textColor, Color.TRANSPARENT, height, top);
        tb.dialogue = text.getDialogue(progression);
    }
    ////

    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text      The text you want to be contained in the text box.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     * @param bgColor   Sets the background color of the textbox.
     */
    public AnchoredTextBox(String text, String font, double textSize, Color textColor, Color bgColor, boolean top, double height) {
        createPortraitless(text, font, textSize, textColor, bgColor, height, top);
    }

    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text      The Dialogue object we are going to get our text from. it will grab the first string from the first set.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     * @param bgColor   Sets the background color of the textbox.
     */
    public AnchoredTextBox(Dialogue text, String font, double textSize, Color textColor, Color bgColor, boolean top, double height) {
        createPortraitless(Objects.requireNonNull(text.getDialogue(progression))[0], font, textSize, textColor, bgColor, height, top);
        tb.dialogue = text.getDialogue(progression);
    }

    ////

    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text     The text you want to be contained in the text box.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.*
     *                 Color of the text defaults to Black.
     *                 Color of the background defaults to Transparent.
     */
    public AnchoredTextBox(String portraitPath, String text, String font, double textSize, boolean top, double height) {
        createPortraitfull(portraitPath, text, font, textSize, Color.BLACK, Color.TRANSPARENT, height, top);
    }

    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text     The Dialogue object we are going to get our text from. it will grab the first string from the first set.
     * @param font     The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize Text size of the Textbox object.*
     *                 Color of the text defaults to Black.
     *                 Color of the background defaults to Transparent.
     */
    public AnchoredTextBox(String portraitPath, Dialogue text, String font, double textSize, boolean top, double height) {
        createPortraitfull(portraitPath, Objects.requireNonNull(text.getDialogue(progression))[0], font, textSize, Color.BLACK, Color.TRANSPARENT, height, top);
        tb.dialogue = text.getDialogue(progression);
    }

    ////

    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text      The text you want to be contained in the text box.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     *                  Color of the background defaults to Transparent.
     */
    public AnchoredTextBox(String portraitPath, String text, String font, double textSize, Color textColor, boolean top, double height) {
        createPortraitfull(portraitPath, text, font, textSize, textColor, Color.TRANSPARENT, height, top);
    }

    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text      The Dialogue object we are going to get our text from. it will grab the first string from the first set.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     *                  Color of the background defaults to Transparent.
     */
    public AnchoredTextBox(String portraitPath, Dialogue text, String font, double textSize, Color textColor, boolean top, double height) {
        createPortraitfull(portraitPath, Objects.requireNonNull(text.getDialogue(progression))[0], font, textSize, textColor, Color.TRANSPARENT, height, top);
        tb.dialogue = text.getDialogue(progression);
    }

    ////

    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text      The text you want to be contained in the text box.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     * @param bgColor   Sets the background color of the textbox.
     */
    public AnchoredTextBox(String portraitPath, String text, String font, double textSize, Color textColor, Color bgColor, boolean top, double height) {
        createPortraitfull(portraitPath, text, font, textSize, textColor, bgColor, height, top);
    }

    /**
     * Creates a Textbox object that is anchored to the bottom of the screen.
     *
     * @param text      The Dialogue object we are going to get our text from. it will grab the first string from the first set.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     * @param bgColor   Sets the background color of the textbox.
     */
    public AnchoredTextBox(String portraitPath, Dialogue text, String font, double textSize, Color textColor, Color bgColor, boolean top, double height) {
        createPortraitfull(portraitPath, Objects.requireNonNull(text.getDialogue(progression))[0], font, textSize, textColor, bgColor, height, top);
        tb.dialogue = text.getDialogue(progression);
    }

    ////

    /**
     * Method called by the constructors to consolidate code. This version does not create a portrait on the left side.
     *
     * @param text      The Dialogue object we are going to get our text from. it will grab the first string from the first set.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     * @param bgColor   Sets the background color of the textbox.
     * @param height    Height of the textbox
     * @param top       If its anchored to the top or bottom.
     */
    private void createPortraitless(String text, String font, double textSize, Color textColor, Color bgColor, double height, boolean top) {
        tb = new Textbox(text, font, textSize, textColor, bgColor);
        getChildren().add(this.tb);
        textboxSettings(height, top);
        this.setOnMouseClicked(Event -> nextText());
    }

    /**
     * Method called by the constructors to consolidate code. This version creates a portrait on the left side.
     *
     * @param portraitPath  Path to the portrait used in this box.
     * @param text      The Dialogue object we are going to get our text from. it will grab the first string from the first set.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.
     * @param textColor Sets the text color of the textbox.
     * @param bgColor   Sets the background color of the textbox.
     * @param height    Height of the textbox
     * @param top       If its anchored to the top or bottom.
     */
    private void createPortraitfull (String portraitPath, String text, String font, double textSize, Color textColor, Color bgColor, double height, boolean top) {
        this.portraitPath = portraitPath;
        this.text = text;
        this.font = font;
        this.textSize = textSize;
        this.textColor = textColor;
        this.bgColor = bgColor;

        tb = new Textbox(text, font, textSize, textColor, bgColor);
        portrait = new ImageView(new Image(Objects.requireNonNull(App.class.getResourceAsStream(portraitPath)), App.width/12.0, App.width/12.0, false, false));
        StackPane sp = new StackPane(portrait);
        sp.setMinSize(App.width/10.0, App.width/10.0);
        sp.setStyle("-fx-background-color: black");

        hbox= new HBox(sp, tb);
        hbox.setSpacing(App.height/64.0);
        getChildren().add(hbox);
        textboxSettings(height, top);
        this.setOnMouseClicked(Event -> nextText());
    }

    /**
     * more code consolidation. this method is what makes the textbox be anchored to the top or bottom of the screen.
     *
     * @param height    Height of the textbox
     * @param top       If its anchored to the top or bottom.
     */
    private void textboxSettings(double height, boolean top) {
        tb.setTextBoxWidth(App.width * .9);
        setPrefSize(App.width, height);
        setStyle("-fx-background-color: rgba(100, 50, 250, 255);" +
                "-fx-padding: " + App.height/32.0 + " " + App.height/64.0 + " " + App.height/64.0 + " " + App.height/64.0);
        if (top) {
            setLayoutY(0);
        }
        else {
            setLayoutY(App.height - height);
        }
    }

    public void nextText () {
        tb.nextText(this);
    }

    public void progressDialogue (Dialogue d) {
        progression++;
        if (progression >= d.getAmountOfDialogue()) {
            progression--;
        }
        tb = new Textbox(d.getDialogue(progression)[0], font, textSize, textColor, bgColor);
        tb.dialogue = d.getDialogue(progression);
        hbox.getChildren().add(1, tb);
    }
}
