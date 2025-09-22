package enigma.camp.util;

public class StringUtil {

    public static boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) { // jika bukan lowercase
                return false;
            }
        }
        return true;
    }

}
