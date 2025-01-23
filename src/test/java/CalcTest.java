import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @org.junit.jupiter.api.Test
    void plus() {
        int a=1;
        int b=2;
        assertEquals(3,Calc.plus(a,b));
    }

    @org.junit.jupiter.api.Test
    void substract() {
        int a=1;
        int b=2;
        assertEquals(1,Calc.substract(b,a));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        int a=1;
        int b=2;
        assertEquals(2,Calc.multiply(a,b));
    }

    @org.junit.jupiter.api.Test
    void divByZero() {
       RuntimeException exception= assertThrows(RuntimeException.class,()->Calc.div(2,0));
       assertTrue(exception.getMessage().contains("Zero"));
    }

    @org.junit.jupiter.api.Test
    void div() {
        assertEquals(2,Calc.div(2,1));
    }
}