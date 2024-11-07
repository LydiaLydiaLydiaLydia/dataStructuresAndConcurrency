package RecursionLydiasVersion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testBinarySearch() {
        int [] testArr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        assertEquals(-1, BinarySearch.binarySearch(testArr, 0));
        assertEquals(-1, BinarySearch.binarySearch(testArr, 1));
        assertEquals(0, BinarySearch.binarySearch(testArr, 2));
        assertEquals(6, BinarySearch.binarySearch(testArr, 14));
    }

}