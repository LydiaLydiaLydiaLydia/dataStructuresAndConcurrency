package LinkedListLydiasVersion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    CP3LinkedList<String> names = new CP3LinkedList<>();

    @BeforeEach
    public void SetUp(){
        names.addFirst("Lydia");
        names.addFirst("Emma");
        names.addFirst("Lara");
    }

    @Test
    void addFirst() {
        names.addFirst("Lydia");
        assertEquals("Lydia", names.getFirst());
    }

    @Test
    void getFirst() {
        assertEquals("Lara", names.getFirst());
    }

    @Test
    void removeFirst() {
        assertEquals("Lara", names.removeFirst());
        assertEquals("Emma", names.getFirst());
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    @Test
    void print() throws IOException{
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        names.print();
        baos.flush();
        String whatWasPrinted = baos.toString();
        String[] linesOfOutput = whatWasPrinted.split(
                System.lineSeparator()
        );
        assertEquals("Lara\nEmma\nLydia", linesOfOutput[0] + "\n" + linesOfOutput[1] + "\n" + linesOfOutput[2]);

        System.setOut(null);
        System.setErr(null);
    }

    @Test
    void size() {
        assertEquals(3, names.size());
    }

    @Test
    void contains() {
        assertTrue(names.contains("Lydia"));
    }
}