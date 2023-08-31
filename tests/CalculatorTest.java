import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test 
    void twoPlusTwoMustBeEqualFour(){
        var calculator = new Calculator();
        assertEquals(4, calculator.performAddition(2, 2));
    } 
}
