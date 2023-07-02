package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculationRequestReader calculationRequestReader = new CalculationRequestReader();
        CalculatorRequestVo calculatorRequestVo  = calculationRequestReader.read();
        Calculator calculator = new Calculator();
        calculator.caculator(calculatorRequestVo.getNum1(), calculatorRequestVo.getNum2(), calculatorRequestVo.getOperator());
    }
}