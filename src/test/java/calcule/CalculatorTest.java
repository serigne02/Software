package calcule;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator=new Calculator();
    @Test
    public void sumTest() {
       // Calculator calculator=new Calculator();
        int result=calculator.sum(4,8);
        assertEquals(12,result);
    }

    @Test
    public void minusTest(){
     //   Calculator calculator=new Calculator();
        int result=calculator.minus(8,9);
        assertEquals(-1,result);
    }

    @Test
    public void diviseTest(){
        int result= calculator.divide(10,2);
        assertEquals(5, result);
    }

    @Test
    public void multiplyTest(){
        int result= calculator.multiply(10,2);
        assertEquals(20, result);
    }

    @Test
    public void minTest(){
        int result= calculator.min(10,2);
        assertEquals(2, result);
    }

    @Test
    public void maxTest(){
        int result= calculator.max(10,2);
        assertEquals(10, result);
    }

    @Test
    public void minElementTest(){
        int [] tab={2,5,9,4,7};
        int result= calculator.minElement(tab);
        assertEquals(2, result);
    }

    @Test
    public void maxElementTest(){
        int [] tab={2,5,9,4,7};
        int result= calculator.maxElement(tab);
        assertEquals(9, result);
    }


}