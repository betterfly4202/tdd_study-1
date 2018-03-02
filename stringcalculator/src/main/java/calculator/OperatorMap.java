package calculator;

import java.util.Map;

/**
 *
 */
public class OperatorMap {
    public void Add(Map<String, Operator> map, Operator op){
        map.put(op.getKey(),op);
    }
}
