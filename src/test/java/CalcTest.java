import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void plus() {
        int a=1;
        int b=2;
        assertEquals(3,Calc.plus(a,b));
    }

    @Test
    void substract() {
        int a=1;
        int b=2;
        assertEquals(1,Calc.substract(b,a));
    }

    @Test
    void multiply() {
        int a=1;
        int b=2;
        assertEquals(2,Calc.multiply(a,b));
    }

    @Test
    void divByZero() {
       RuntimeException exception= assertThrows(RuntimeException.class,()->Calc.div(2,0));
       assertTrue(exception.getMessage().contains("Zero"));
    }

    @Test
    void div() {
        assertEquals(2,Calc.div(2,1));
    }
}