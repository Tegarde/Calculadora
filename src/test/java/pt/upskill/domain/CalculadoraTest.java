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
        double result = calc.calculateProduct(2, 5);
        assertEquals(10, result);
    }

    @Test
    void calculateProductWithStoreResult() {
        calc.save(10);
        double result = calc.calculateProduct(2.5);
        assertEquals(25.0, result, 0.01);
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
    void eraseSavedResult() {
        calc.save(10); // save result
        calc.erase(); // erase saved result

        double result = calc.sum(5);
        double expected = 5;
        assertEquals(expected, result);
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
    void powerWithZeroExponent() {
        double result = calc.power(2, 0);
        assertEquals(1.0, result, 0.01);
    }

    @Test
    void powerWithNegativeExponent() {
        double result = calc.power(2, -3);
        assertEquals(0.125, result, 0.01);
    }

    @Test
    void powerWithZeroBase() {
        double result = calc.power(0, 3);
        assertEquals(0.0, result, 0.01);
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
    void calculateFactorialLargeNumber() {
        int result = calc.calculateFactorial(10);
        assertEquals(3628800, result);
    }

    @Test
    void testIsComposedByCubes() {
        boolean result = calc.isComposedByCubes(153);
        assertTrue(result);
        result = calc.isComposedByCubes(123);
        assertFalse(result);
    }

    @Test
    void testDecimalToBinary() {
        int result = calc.decimalToBinary(15);
        assertEquals(1111, result);
        result = calc.decimalToBinary(300);
        assertEquals(100101100, result);
        result = calc.decimalToBinary(66);
        assertEquals(1000010, result);
    }

    @Test
    void testIsPrimeNumberTrue() {
        boolean result = calc.isPrime(7);
        assertTrue(result);
    }

    @Test
    void testIsPrimeNumberFalse() {
        boolean result = calc.isPrime(6);
        assertFalse(result);
    }

    @Test
    void testIsPrimeNumberLargePrime() {
        assertTrue(calc.isPrime(7919));
    }

    @Test
    void testIsPrimeNumberLargeNonPrime() {
        assertFalse(calc.isPrime(8000));
    }

    @Test
    void testBinaryToDecimal() {
        double result = calc.binaryToDecimal("1010");
        assertEquals(10, result);
    }

    @Test
    void testDecimalToBinary() {
        int result = calc.decimalToBinary(10);
        assertEquals(1010, result);
    }

    @Test
    void testIntToHex() {
        String result = calc.intToHex(255);
        assertEquals("ff", result);
    }

    @Test
    void testIsPrimeNumberEdgeCases() {
        assertFalse(calc.isPrime(0));
        assertFalse(calc.isPrime(1));
        assertTrue(calc.isPrime(2));
    }
}
