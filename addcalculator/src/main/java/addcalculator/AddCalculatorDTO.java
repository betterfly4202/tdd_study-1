package addcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by orange2652@gmail.com on 2018. 3. 3.
 * Github : https://github.com/myeongkwonhwang
 */
public class AddCalculatorDTO {
    public static int add(String str){
        if(isBlank(str)){
            return 0;
        }
        return sum(toInt(splitStr(str)));
    }

    private String[] splitStr(String str) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(str);
        if(matcher.find()){
            String customDelimeter = matcher.group(1);
            return matcher.group(2).split(customDelimeter);
        }
        return str.split(",|:");
    }

    private boolean isBlank(String str) {
        return str == null || str.isEmpty();
    }

    private int sum(int[] numbers) {
        int sum = 0;
        for(int number : numbers)
            sum += number;

        return sum;
    }

    private int[] toInt(String[] values) {
        int[] numbers = new int[values.length];
        for(int i = 0; i < values.length; i++){
            numbers[i] = toPositive(values[i]);
        }

        return numbers;
    }

    private int toPositive(String value) {
        int number = Integer.parseInt(value);
        if (number < 0) {
            throw new RuntimeException();
        }
        return number;
    }


}
