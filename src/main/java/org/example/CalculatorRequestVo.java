package org.example;

import java.util.List;

public class CalculatorRequestVo {
    private final long num1;
    private final long num2;
    private final String operator;

    public CalculatorRequestVo(String[] parts) {

        if(parts.length != 3) {
            throw new BedRequestException();
        }


        if(parts[1].length() != 1 || isInvalidOperator(parts[1])){
            throw new InvalidOperatorException();
        }

        this.num1 = Long.parseLong(parts[0]);
        this.num2 = Long.parseLong(parts[2]);
        this.operator = parts[1];
    }

    private static boolean isInvalidOperator(String part) {
        return !part.equals("-")
                && !part.equals("+")
                && !part.equals("*")
                && !part.equals("/");
    }

    public long getNum1() {
        return num1;
    }

    public long getNum2() {
        return num2;
    }

    public String getOperator() {
        return operator;
    }
}
