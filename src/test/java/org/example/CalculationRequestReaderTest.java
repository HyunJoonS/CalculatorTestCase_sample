package org.example;


import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class CalculationRequestReaderTest  {

    @Test
    public void System_in으로_데이터를_읽어들일_수_있다(){
        CalculationRequestReader calculationRequestReader = new CalculationRequestReader();

        //when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        CalculatorRequestVo calculatorRequestVo = calculationRequestReader.read();

        assertEquals(2,calculatorRequestVo.getNum1());
        assertEquals("+",calculatorRequestVo.getOperator());
        assertEquals(3,calculatorRequestVo.getNum2());
    }

}