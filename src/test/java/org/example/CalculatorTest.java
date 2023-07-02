package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    @Test
    public void 덧셈_연산을_할_수_있다(){
        //given
        long num1=2;
        long num2=3;
        String operator = "+";
        Calculator calculator = new Calculator();

        //when
        long result = calculator.caculator(num1, num2, operator);

        //then
        assertEquals(5, result);
    }

    @Test
    public void 뺄셈_연산을_할_수_있다(){
        //given
        long num1=2;
        long num2=3;
        String operator = "-";
        Calculator calculator = new Calculator();

        //when
        long result = calculator.caculator(num1, num2, operator);

        //then
        assertEquals(-1, result);
    }@Test
    public void 곱셈_연산을_할_수_있다(){
        //given
        long num1=2;
        long num2=3;
        String operator = "*";
        Calculator calculator = new Calculator();

        //when
        long result = calculator.caculator(num1, num2, operator);

        //then
        assertEquals(6, result);
    }

    @Test
    public void 나눗셈_연산을_할_수_있다(){
        //given
        long num1=6;
        long num2=3;
        String operator = "/";
        Calculator calculator = new Calculator();

        //when
        long result = calculator.caculator(num1, num2, operator);

        //then
        assertEquals(2, result);
    }

    @Test
    public void 잘못된_연산자가_요청으로_들어올_경우_에러가_난다(){
        //given
        long num1=6;
        long num2=3;
        String operator = "x";
        Calculator calculator = new Calculator();

        //when
        //then
        assertThrows(InvalidOperatorException.class,()->{
            calculator.caculator(num1, num2, operator);
        });
    }

}