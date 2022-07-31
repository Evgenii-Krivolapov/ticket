import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {
    Airplane airplane = new Airplane("������","����");
    @Test
    void gate() {
        airplane.gate();
        List<String> actual = airplane.getList();
        List<String> expected = new ArrayList<>();
        expected.add("A");
        expected.add("B");
        expected.add("C");
        expected.add("D");
        expected.add("E");
        expected.add("F");
        assertArrayEquals(expected.toArray(),actual.toArray());
    }

    @Test
    void airplane() {
        List<String> actual = airplane.airplane();
        List<String> expected = new ArrayList<>();
        expected.add("������� ��-134");
        expected.add("������� ��-154 ");
        expected.add("������� ��-62");
        expected.add("������� ��-96");
        expected.add("��-96-300");
        expected.add("��-96�");
        expected.add("Airbus A310");
        expected.add("Airbus A320");
        expected.add("Airbus A330");
        expected.add("Boeing-737");
        expected.add("Boeing-747");
        assertArrayEquals(expected.toArray(),actual.toArray());
    }
}