package RecursionLydiasVersion;

import org.junit.jupiter.api.Test;

import static RecursionLydiasVersion.Q4Fibonacci.FibonacciNonRecursive;
import static RecursionLydiasVersion.Q4Fibonacci.FibonacciRecursive;
import static org.junit.jupiter.api.Assertions.*;

class Q4FibonacciTest {
    @Test
    void testFibNonRecursive(){
        assertEquals(0, FibonacciNonRecursive(0));
        assertEquals(1, FibonacciNonRecursive(1));
        assertEquals(1, FibonacciNonRecursive(2));
        assertEquals(2, FibonacciNonRecursive(3));
        assertEquals(3, FibonacciNonRecursive(4));
        assertEquals(5, FibonacciNonRecursive(5));
        assertEquals(8, FibonacciNonRecursive(6));
        assertEquals(13, FibonacciNonRecursive(7));
        assertEquals(21, FibonacciNonRecursive(8));
        assertEquals(34, FibonacciNonRecursive(9));
    }

    @Test
    void testFibRecursive(){
        assertEquals(0, FibonacciRecursive(0));
        assertEquals(1, FibonacciRecursive(1));
        assertEquals(1, FibonacciRecursive(2));
        assertEquals(2, FibonacciRecursive(3));
        assertEquals(3, FibonacciRecursive(4));
        assertEquals(5, FibonacciRecursive(5));
        assertEquals(8, FibonacciRecursive(6));
        assertEquals(13, FibonacciRecursive(7));
        assertEquals(21, FibonacciRecursive(8));
        assertEquals(34, FibonacciRecursive(9));
    }
}