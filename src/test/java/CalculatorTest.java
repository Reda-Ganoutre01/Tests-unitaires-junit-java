import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Sum of Two plus Two")
    void CheckIfSumTwoPlusTwoEqualsFour() {
        assertEquals(4,Calculator.sum(2,2));

        assertAll(
                "Check multiple Sums",
                ()->assertEquals(10,Calculator.sum(4,6)),
                ()->assertEquals(4,Calculator.sum(2,2)),
                ()->assertEquals(30,Calculator.sum(15,15)),
                ()->assertNotEquals(22,Calculator.sum(10,11))

                );
    }

    @Test
    @DisplayName("Multiply  Two and five")
    void CheckIfTwoMultiplyByFiveEqualsTen() {
        assertEquals(10,Calculator.multiply(2,5));
    }
}