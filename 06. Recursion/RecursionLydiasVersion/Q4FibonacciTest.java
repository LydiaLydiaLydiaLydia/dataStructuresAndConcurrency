package RecursionLydiasVersion;

import org.junit.jupiter.api.Test;

import static RecursionLydiasVersion.Q4Fibonacci.FibonacciNonRecursive;
import static RecursionLydiasVersion.Q4Fibonacci.FibonacciRecursive;
import static org.junit.jupiter.api.Assertions.*;

class Q4FibonacciTest {
    @Test
    void testFibNonRecursive(){
        assertEquals(8, FibonacciNonRecursive(6));
        assertEquals(13, FibonacciNonRecursive(7));
        assertEquals(21, FibonacciNonRecursive(8));
        assertEquals(34, FibonacciNonRecursive(9));
        assertEquals(55, FibonacciNonRecursive(10));
    }

    @Test
    void testFibRecursive(){
        assertEquals(8, FibonacciRecursive(6));
        assertEquals(13, FibonacciRecursive(7));
        assertEquals(21, FibonacciRecursive(8));
        assertEquals(34, FibonacciRecursive(9));
        assertEquals(55, FibonacciRecursive(10));
    }
}