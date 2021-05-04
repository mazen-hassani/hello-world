import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class TestHello {
    @Test
    public void testApp() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(bos));
            Hello.main(null);
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("42\n", bos.toString());
    }

    @Test
    public void testSum() {
        assertEquals(0, Hello.sum(-1, 1));
        assertEquals(42, Hello.sum(17, 25));
    }
}
