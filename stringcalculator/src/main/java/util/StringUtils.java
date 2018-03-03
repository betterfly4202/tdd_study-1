package util;


public class StringUtils {

    public static int toInt(String s) {

        int parseVal = 0;
        try{
            parseVal = Integer.parseInt(s);
        }catch (NumberFormatException e){
            e.getMessage();
        }
        return parseVal;
    }

    public static String[] splitArgs(String calcArgs) {

        return calcArgs.split(" |,|:");
    }

    public static boolean isBlank(String str) {
        return str.isEmpty() || str == null;
    }
}
