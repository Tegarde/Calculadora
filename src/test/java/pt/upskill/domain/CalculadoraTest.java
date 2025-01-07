package pt.upskill.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    Calculadora calc = new Calculadora();

    @Test
    void sumTwoNumbers() {
        double result = calc.sum(5, 3);
        assertEquals(8.0, result, 0.01);
    }

    @Test
    void sumWithStoreResult() {
        calc.save(10);
        double result = calc.sum(5.0);
        assertEquals(15.0, result, 0.01);
    }

    @Test
    void subtraction() {
    }

    @Test
    void testSubtraction() {
    }

    @Test
    void calculateProduct() {
    }

    @Test
    void testCalculateProduct() {
    }

    @Test
    void division() {
    }

    @Test
    void testDivision() {
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

    @Test
    void testIsComposedByCubes() {
        boolean result = calc.isComposedByCubes(153);
        assertTrue(result);
        result = calc.isComposedByCubes(123);
        assertFalse(result);
    }
}