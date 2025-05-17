/*
 * Class: CMSC201 
 * Instructor: Amanullah Khalid
 * Description: Tests isPrime method by using JUnit.
 * Due: 05/19/25
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Julian Zintel
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeNumberMethodTest {

    @Test
    public void testIsPrimeWithPrime() {
        assertTrue(PrimeNumberMethod.isPrime(7));
        assertTrue(PrimeNumberMethod.isPrime(13));
    }

    @Test
    public void testIsPrimeWithNonPrime() {
        assertFalse(PrimeNumberMethod.isPrime(1));
        assertFalse(PrimeNumberMethod.isPrime(4));
    }

    @Test
    public void testIsPrimeWithNegative() {
        assertFalse(PrimeNumberMethod.isPrime(-5));
    }

    @Test
    public void testIsPrimeWithTwo() {
        assertTrue(PrimeNumberMethod.isPrime(2));
    }
}
