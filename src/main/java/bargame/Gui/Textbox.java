package bargame.Gui;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class Textbox extends TextFlow {
    String str;

    /**
     * Creates a Textbox object that can be used to denote alerts, or NPCs dialogue.
     *
     * @param text      The text you want to be contained in the text box.
     * @param font      The font of the text box. If a font cannot be found, it will default to Arial. This is dictated by .setStyle rather than this program, and does not throw an error if this is to happen.
     * @param textSize  Text size of the Textbox object.*
     *                  Color of the text defaults to Black.
     *                  Color of the background defaults to Transparent.
     */
    public Textbox(String text, String font, double textSize) {
        create(text, font, textSize, Color.BLACK, Color.TRANSPARENT);
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
    public Textbox(String text, String font, double textSize, Color textColor) {
        create(text, font, textSize, textColor, Color.TRANSPARENT);
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
    public Textbox(String text, String font, double textSize, Color textColor, Color bgColor) {
        create(text, font, textSize, textColor, bgColor);
    }

    /**
     * Method that the constructors use to create the text boxes.
     *
     * @param text
     * @param font
     * @param textSize
     * @param textColor
     * @param bgColor
     */
    private void create (String text, String font, double textSize, Color textColor, Color bgColor) {
        String[] words = text.split(" ");
        for (int a = 0; a < words.length; a++) {
            Text t;
            if (a != 0) {
                t = new Text(" " + words[a]);
            }
            else {
                t = new Text(words[a]);
            }
            t.setStyle("-fx-font: " + textSize + "px " + font + ";" +
                    "-fx-background-color: " + toHexString(bgColor));
            t.setStroke(textColor);
            t.setStrokeWidth(0.01);
            getChildren().add(t);
        }
        this.str = text;
    }

    /**
     * Change the text of the textbox. does not allow for changes of font.
     *
     * @param str      The updated text.
     */
    public void setStr(String str) {
        this.str = str;
        getChildren().clear();
        String[] words = str.split(" ");
        for (String string : words) {
            Text t = new Text(string);
            getChildren().add(t);
        }
    }

    /**
     * Change the background color of the textbox.
     *
     * @param bgColor   The background color to change to.
     */
    public void setBackgroundColor (Color bgColor) {
        setStyle("-fx-background-color: " + toHexString(bgColor));
    }

    /**
     * Change the text color of the textbox.
     *
     * @param textColor   The background color to change to.
     */
    public void setTextColor (Color textColor) {
        for (Node n : getChildren()) {
            n.setStyle("-fx-text-fill: " + toHexString(textColor));
        }
    }

    /**
     * Sets the width of the TextFlow
     *
     * @param width     specified width
     */
    public void setTextBoxWidth(double width) {
        setMinWidth(width);
        setPrefWidth(width);
    }


    /////
    /**
     * The following helper method is thanks to Krow. converts a double to hex.
     * @see <a href="https://stackoverflow.com/users/5921170/kr%c3%b6w.">...</a>
     *
     * @param val   input to be returned as a hex string of that value.
     */
    private String format(double val) {
        String in = Integer.toHexString((int) Math.round(val * 255));
        return in.length() == 1 ? "0" + in : in;
    }

    /**
     * The following helper method is thanks to Krow. converts a javaFX color to hex.
     * @see <a href="https://stackoverflow.com/users/5921170/kr%c3%b6w.">...</a>
     *
     * @param value changes a JavaFX color into a hex string.
     */
    public String toHexString(Color value) {
        return "#" + (format(value.getRed()) + format(value.getGreen()) + format(value.getBlue()) + format(value.getOpacity()))
                .toUpperCase();
    }
    /////
}
