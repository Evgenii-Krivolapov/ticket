import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TerminalTest {

    Terminal terminal = new Terminal("Evgenii," , "Krivolapov", "Leonidovith");
    @org.junit.jupiter.api.Test
    void testTerminal() {
        List<String> actual = terminal.terminal();
        List<String> expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");
        expected.add("D");
        assertArrayEquals(expected.toArray(),actual.toArray());
    }

    @org.junit.jupiter.api.Test
    @ParameterizedTest
    @ValueSource(ints = {36})
    void testPriceBaggageTransportation(int bag) {
            terminal.priceBaggageTransportation(bag);
            int actual = terminal.getCash();
            int expected = 900;
            assertEquals(expected, actual);
    }
}