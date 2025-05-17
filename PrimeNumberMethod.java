/*
 * Class: CMSC201 
 * Instructor: Amanullah Khalid
 * Description: Defines method, checking if number is prime.
 * Due: 05/19/25
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Julian Zintel
 */

/**
 * Utility class for prime number checking.
 */
public class PrimeNumberMethod {

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
