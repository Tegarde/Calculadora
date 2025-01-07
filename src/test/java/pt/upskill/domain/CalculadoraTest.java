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
    }

    @Test
    void testPower() {
    }
}