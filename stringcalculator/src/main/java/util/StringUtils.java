package util;


public class StringUtils {

    public static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static String[] splitArgs(String calcArgs) {

        return calcArgs.split(" |,|:");
    }

    public static boolean isBlank(String str) {
        return str.isEmpty() || str == null;
    }
}
