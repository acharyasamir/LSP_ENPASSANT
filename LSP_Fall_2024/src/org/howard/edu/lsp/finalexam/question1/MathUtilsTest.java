/**
*  Name: Samir Acharya
*/

package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    void testFactorial_PositiveNumber() {
        assertEquals(120, mathUtils.factorial(5));
        assertEquals(1, mathUtils.factorial(0));
        assertEquals(1, mathUtils.factorial(1));
    }

    @Test
    void testFactorial_NegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);
        });
    }

    @Test
    void testIsPrime_PrimeNumber() {
        assertTrue(mathUtils.isPrime(5));
        assertTrue(mathUtils.isPrime(13));
    }

    @Test
    void testIsPrime_NotPrimeNumber() {
        assertFalse(mathUtils.isPrime(4));
        assertFalse(mathUtils.isPrime(1));
        assertFalse(mathUtils.isPrime(-7));
    }

    @Test
    void testGcd_PositiveNumbers() {
        assertEquals(6, mathUtils.gcd(54, 24));
        assertEquals(1, mathUtils.gcd(17, 13));
    }

    @Test
    void testGcd_OneNumberZero() {
        assertEquals(5, mathUtils.gcd(0, 5));
        assertEquals(7, mathUtils.gcd(7, 0));
    }

    @Test
    void testGcd_BothNumbersZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);
        });
    }
}
