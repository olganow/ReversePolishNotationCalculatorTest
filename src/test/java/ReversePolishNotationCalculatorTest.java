import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        String text = "4 3 +";
        int expectedSum = 7;
        int resultSum = calculator.calculatePolishNotation(text);
        Assertions.assertEquals(expectedSum, resultSum);
    }

    @Test
    public void shouldCalculateSubtraction() {
        String text = "4 3 -";
        int expectedSub = 1;
        int resultSub = calculator.calculatePolishNotation(text);
        Assertions.assertEquals(expectedSub, resultSub);
    }

    @Test
    public void shouldCalculateMultiplication() {
        String text = "4 3 *";
        int expectedMult = 12;
        int resultMult = calculator.calculatePolishNotation(text);
        Assertions.assertEquals(expectedMult, resultMult);
    }

    @Test
    public void shouldCalculateMultiplicationWithNegativeNumber() {
        String text = "4 -3 *";
        int expectedMult = -12;
        int resultMult = calculator.calculatePolishNotation(text);
        Assertions.assertEquals(expectedMult, resultMult);
    }

    @Test
    public void shouldCalculateAdditionAndMultiplication() {
        String text = "1 2 3 - +";
        int expectedMult = 0;
        int resultMult = calculator.calculatePolishNotation(text);
        Assertions.assertEquals(expectedMult, resultMult);
    }
}

