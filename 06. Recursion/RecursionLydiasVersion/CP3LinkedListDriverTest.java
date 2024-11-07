package RecursionLydiasVersion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListDriverTest {

    CP3LinkedList<String> names = new CP3LinkedList<>();
    @BeforeEach
    void setUp() {
        names.addFirst("Lydia");
        names.addFirst("Laura");
        names.addFirst("Silva");
    }

    @Test
    void testRecursiveSize() {
        assertEquals(3, names.sizeRecursive());
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    @Test
    void testRecursivePrint() throws IOException{
            System.setOut(new PrintStream(outContent));
            System.setErr(new PrintStream(errContent));

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(baos));
            names.printRecursive();
            baos.flush();
            String whatWasPrinted = baos.toString();
            String[] linesOfOutput = whatWasPrinted.split(
                    System.lineSeparator()
            );
            assertEquals("Silva\nLaura\nLydia", linesOfOutput[0] + "\n" + linesOfOutput[1] + "\n" + linesOfOutput[2]);

            System.setOut(null);
            System.setErr(null);
    }

    @Test
    void testRecursivePrintBackwards() throws IOException{
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        names.printRecursiveBackwards();
        baos.flush();
        String whatWasPrinted = baos.toString();
        String[] linesOfOutput = whatWasPrinted.split(
                System.lineSeparator()
        );
        assertEquals("Lydia\nLaura\nSilva", linesOfOutput[0] + "\n" + linesOfOutput[1] + "\n" + linesOfOutput[2]);

        System.setOut(null);
        System.setErr(null);
    }

}