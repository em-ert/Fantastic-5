/**
* This program sets red, green, and blue values, which are each integers, then passes them to the rgbToHex function,
* which converts the color in rgb format to a string containing the color in hex format.
*/

public class rgb_to_hex {
    public static void main(String[] args) {
        int r = 255;
        int g = 127;
        int b = 0;
        String hexColor = rgbToHex(r, g, b);
        System.out.println("RGB color (" + r + ", " + g + ", " + b + ") = " + hexColor);
    }

    /**
     * Function which converts an rgb color to a hex color
     * @param r an integer containing a red value
     * @param g an integer containing a green value
     * @param b an integer containing a blue value
     * @return a formatted string containing the rgb color in hex format
    */
    public static String rgbToHex(int r, int g, int b) {
        r = Math.min(255, Math.max(0, r));
        g = Math.min(255, Math.max(0, g));
        b = Math.min(255, Math.max(0, b));
        return String.format("%02X%02X%02X", r, g, b);
    }
}

//Test with RGB color (255, 127, 0) = FF7F00


