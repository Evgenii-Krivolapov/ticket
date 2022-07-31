import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EnterTerminalTest {
    private EnterTerminal enter = new EnterTerminal();

    @Test
    void enterTerminal() {
        List <String> actual = enter.enterTerminal();
        List<String> expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");
        expected.add("D");
        assertArrayEquals(expected.toArray(),actual.toArray());
    }
}