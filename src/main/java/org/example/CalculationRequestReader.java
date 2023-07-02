package org.example;

import java.util.Scanner;

public class CalculationRequestReader {
    public CalculatorRequestVo read() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number and an operator (e.g 1 + 2): ");
        String result = scanner.nextLine();
        CalculatorRequestVo vo = new CalculatorRequestVo(result.split(" "));
        return vo;
    }
}
