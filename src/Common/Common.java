package Common;

// methods which are used across all application

public class Common {

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }

        return true;
    }
}
