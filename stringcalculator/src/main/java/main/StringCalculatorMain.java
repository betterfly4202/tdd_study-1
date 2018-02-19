package main;

import calculator.*;
import com.sun.org.apache.xpath.internal.operations.Minus;
import com.sun.org.apache.xpath.internal.operations.Plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StringCalculatorMain {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String calcArgs = in.readLine();

        if(isBlank(calcArgs)) {
            throw new IllegalArgumentException();
        }

        OperatorOuter oClass = new OperatorOuter();

        String [] calcArr = thisSplit(calcArgs);
        int result = toInt(calcArr[0]);

        for (int i = 1; i < calcArr.length; i+=2){
            result = oClass.hm.get(calcArr[i]).operate(result, toInt(calcArr[i+1]));
        }

        System.out.println(result);
    }

    private static int toInt(String s) {
        return Integer.parseInt(s);
    }

    private static String[] thisSplit(String calcArgs) {

        return calcArgs.split(" |,|:");
    }

    private static boolean isBlank(String str) {
        return str.isEmpty() || str == null;
    }
}
