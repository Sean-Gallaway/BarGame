package bargame.Gui;

import bargame.App;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

public class AnchoredTextBox extends FlowPane {
    Textbox tb;

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
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
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
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
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
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

    private void createPortraitless(String text, String font, double textSize, Color textColor, Color bgColor, double height, boolean top) {
        tb = new Textbox(text, font, textSize, textColor, bgColor);
        getChildren().add(this.tb);
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
}
