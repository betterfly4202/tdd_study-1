package calculator;

import java.util.HashMap;

/**
 * operator 들의 InnerClass를 가진 OuterClass
 * hashMap<key, operator>로 각 클래스의 연산자를 put
 */
public class OperatorOuter {

    HashMap<String, Operator> calculatorMap;
    OperatorMap operatorMap;

    public OperatorOuter() {

        calculatorMap = new HashMap<String, Operator>();
        operatorMap = new OperatorMap();
        operatorMap.Add(calculatorMap, new Plus());
        operatorMap.Add(calculatorMap, new Minus());
        operatorMap.Add(calculatorMap, new Multiply());
        operatorMap.Add(calculatorMap, new Divider());
    }

    private class Divider implements  Operator{
        private final String key = "/";

        @Override
        public int operate(int number1, int number2) {
            return number1 / number2;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    private class Minus implements Operator{
        private final String key = "-";

        @Override
        public int operate(int number1, int number2) {
            return number1 - number2;
        }

        @Override
        public String getKey() {
            return key;
        }
    }

    private class Multiply implements  Operator{
        private final String key = "*";

        @Override
        public int operate(int number1, int number2) {
            return number1 * number2;
        }

        @Override
        public String getKey(){
            return key;
        }
    }

    private class Plus implements Operator {
        private final String key = "+";

        @Override
        public int operate(int number1, int number2) {
            return number1 + number2;
        }

        @Override
        public String getKey() {
            return key;
        }
    }
}
