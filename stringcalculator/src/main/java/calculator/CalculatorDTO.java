package calculator;

import static util.StringUtils.isBlank;
import static util.StringUtils.splitArgs;
import static util.StringUtils.toInt;

public class CalculatorDTO {
    public static int resultCalculator(String calcArgs){
        if(isBlank(calcArgs)) {
            throw new IllegalArgumentException();
        }

        OperatorOuter oClass = new OperatorOuter();

        String [] calcArr = splitArgs(calcArgs);
        int result = toInt(calcArr[0]);

        for (int i = 1; i < calcArr.length; i+=2){
            result = oClass.calculatorMap.get(calcArr[i]).operate(result, toInt(calcArr[i+1]));
        }

        return result;
    }
}
