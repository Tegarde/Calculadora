package pt.upskill.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    void sumTwoNumbers() {
        double result = calc.sum(5, 3);
        double expected = 8;
        assertEquals(expected, result);
    }

    @Test
    void sumWithStoreResult() {
        calc.save(10);
        double result = calc.sum(5.0);
        double expected = 15;
        assertEquals(expected, result);
    }

    @Test
    void subtractionTwoNumbers() {
        double result = calc.subtraction(5, 3);
        double expected = 2;
        assertEquals(expected, result);
    }

    @Test
    void subtractionTwoNumbersWithFirstNumberLessThanSecond() {
        double result = calc.subtraction(3, 5);
        double expected = -2;
        assertEquals(expected, result);
    }

    @Test
    void subtractionWithStoreResult() {
        calc.save(10);
        double result = calc.subtraction(5);
        double expected = 5;
        assertEquals(expected, result);
    }

    @Test
    void calculateProduct() {
    }

    @Test
    void testCalculateProduct() {
    }

    @Test
    void divisionTwoNumbers() {
        double result = calc.division(10, 3);
        double expected = 3.33;
        assertEquals(expected, result, 0.01);
    }

    @Test
    void divisionByZero_ShouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calc.division(10, 0));
    }

    @Test
    void divisionWithStoreResult() {
        calc.save(10);
        double result = calc.division(3);
        double expected = 3.33;
        assertEquals(expected, result, 0.01);
    }

    @Test
    void save() {
    }

    @Test
    void erase() {
    }

    @Test
    void power() {
        calc.save(2);
        double result = calc.power(3);
        assertEquals(8.0, result, 0.01);
    }

    @Test
    void testPower() {
        double result = calc.power(2, 3);
        assertEquals(8.0, result, 0.01);
    }

    @Test
    void calculateFactorial() {
        int result = calc.calculateFactorial(5);
        assertEquals(120, result);
    }

    @Test
    void calculateFactorialZero() {
        int result = calc.calculateFactorial(0);
        assertEquals(1, result);
    }

    @Test
    void calculateFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.calculateFactorial(-1);
        });
        assertEquals("Number must be non-negative.", exception.getMessage());
    }

    @Test
    void testIsComposedByCubes() {
        boolean result = calc.isComposedByCubes(153);
        assertTrue(result);
        result = calc.isComposedByCubes(123);
        assertFalse(result);
    }
}
