/*
 * Class: CMSC201 
 * Instructor: Amanullah Khalid
 * Description: JUnit test for the string methods including length, charAt, substring, and indexOf
 * Due: 05/19/25
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Julian Zintel
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class StringTest {

    @Test
    public void testLength() {
        String s = "Hello";
        assertEquals(5, s.length());
    }

    @Test
    public void testCharAt() {
        String s = "World";
        assertEquals('W', s.charAt(0));
    }

    @Test
    public void testSubstring() {
        String s = "Java Programming";
        assertEquals("Programming", s.substring(5));
    }

    @Test
    public void testIndexOf() {
        String s = "Test String";
        assertEquals(5, s.indexOf("S"));
    }
}
