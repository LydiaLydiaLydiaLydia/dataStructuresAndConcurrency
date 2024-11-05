package LydiasVersion;

import org.junit.jupiter.api.Test;

import static LydiasVersion.Lab03.isBalanced;
import static LydiasVersion.Lab03Deque.isDequeBalanced;
import static org.junit.jupiter.api.Assertions.*;

class Lab03Test {
    @Test
    void test() {
        assertEquals(isBalanced("(2+[5+7]+1)"), true);
        assertEquals(isBalanced("((){<(())>})"), true);
        assertEquals(isBalanced("(>2+5+7)"), false);
        assertEquals(isBalanced("(>2+5+7<)"), false);
        assertEquals(isBalanced("lydia "), true);
    }

    @Test
    void dequeTest() {
        assertEquals(isDequeBalanced("(2+[5+7]+1)"), true);
        assertEquals(isDequeBalanced("((){<(())>})"), true);
        assertEquals(isDequeBalanced("(>2+5+7)"), false);
        assertEquals(isDequeBalanced("(>2+5+7<)"), false);
        assertEquals(isDequeBalanced("lydia "), true);
    }
}