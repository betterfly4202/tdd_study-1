package controller;

import calculator.CalculatorDAO;
import calculator.CalculatorDTO;

import java.io.IOException;

public class StringCalculatorController {
    public static void main(String[] args){

        int result = 0;

        try {
            result = CalculatorDTO.resultCalculator(CalculatorDAO.exeCalculator());
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
