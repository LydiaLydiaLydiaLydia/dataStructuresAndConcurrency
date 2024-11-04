package LydiasVersion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    CP3LinkedList<String> names = new CP3LinkedList<>();

    @BeforeEach
    public void SetUp(){

    }

    @Test
    void addFirst() {
        //CP3LinkedList<String> names = new CP3LinkedList<>();
        names.addFirst("Lydia");
        assertEquals("Lydia", names.getFirst());
    }

    //@Test
    //void getFirst() {
    //}

    @Test
    void removeFirst() {
        names.addFirst("Emma");
        names.addFirst("Lara");
        assertEquals("Lara", names.removeFirst());
        assertEquals("Emma", names.getFirst());
    }

    @Test
    void print() {
    }

    @Test
    void size() {
    }

    @Test
    void contains() {
    }
}