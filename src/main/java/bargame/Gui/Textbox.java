package bargame.Gui;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class Textbox {
    String text;
    Label l = new Label();

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
        this.text = text;
        l.setText(text);
        l.setStyle("-fx-font: " + textSize + "px " + font + ";" +
                "-fx-background-color: " + toHexString(Color.TRANSPARENT));
        l.setTextFill(Color.BLACK);
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
        this.text = text;
        l.setText(text);
        l.setStyle("-fx-font: " + textSize + "px " + font + ";" +
                "-fx-background-color: " + toHexString(Color.TRANSPARENT));
        l.setTextFill(textColor);
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
        this.text = text;
        l.setText(text);
        l.setStyle("-fx-font: " + textSize + "px " + font + ";" +
                "-fx-background-color: " + toHexString(bgColor));
        l.setTextFill(textColor);
    }

    /**
     * Change the text of the textbox. does not allow for changes of font.
     *
     * @param text      The updated text.
     */
    public void setText (String text) {
        this.text = text;
        l.setText(text);
    }

    /**
     * Change the background color of the textbox.
     *
     * @param bgColor   The background color to change to.
     */
    public void setBackgroundColor (Color bgColor) {
        l.setStyle("-fx-background-color: " + toHexString(bgColor));
    }

    /**
     * Change the text color of the textbox.
     *
     * @param textColor   The background color to change to.
     */
    public void setTextColor (Color textColor) {
        l.setStyle("-fx-text-fill: " + toHexString(textColor));
    }

    /**
     * Returns the Label this class contains.
     *
     * @return  Label named l is returned.
     */
    public Label getAlert () {
        return l;
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
