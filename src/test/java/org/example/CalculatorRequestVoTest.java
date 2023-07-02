package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorRequestVoTest {

    @Test
    public void 유효한_숫자를_파싱할_수_있다(){
        //given
        String[] parts = new String[]{"2","+","3"};

        //when
        CalculatorRequestVo calculatorRequestVo = new CalculatorRequestVo(parts);

        //then
        assertEquals(2,calculatorRequestVo.getNum1());
        assertEquals(3,calculatorRequestVo.getNum2());
        assertEquals("+",calculatorRequestVo.getOperator());
    }

    public void 유효한_세자리_숫자를_파싱할_수_있다(){
        //given
        String[] parts = new String[]{"2","+","3"};

        //when
        CalculatorRequestVo calculatorRequestVo = new CalculatorRequestVo(parts);

        //then
        assertEquals(2,calculatorRequestVo.getNum1());
        assertEquals(3,calculatorRequestVo.getNum2());
        assertEquals("+",calculatorRequestVo.getOperator());
    }

    @Test
    public void 유효한_길이의_숫자가_들어오지_않으면_에러(){
        //given
        String[] parts = new String[]{"221312","+"};

        //when
        //then
        assertThrows(BedRequestException.class, ()->{
            new CalculatorRequestVo(parts);
        });
    }

    @Test
    public void 유효하지_않은_연산자가_들어오면_에러(){
        //given
        String[] parts = new String[]{"12","x","123"};

        //when
        //then
        assertThrows(InvalidOperatorException.class, ()->{
            new CalculatorRequestVo(parts);
        });
    }

    @Test
    public void 유효하지_않은_길이의_연산자가_들어오면_에러(){
        //given
        String[] parts = new String[]{"12","+-","123"};

        //when
        //then
        assertThrows(InvalidOperatorException.class, ()->{
            new CalculatorRequestVo(parts);
        });
    }


}