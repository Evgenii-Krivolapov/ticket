import java.util.ArrayList;
import java.util.List;

public class EnterTerminal {
    private List<String> listTerminal = new ArrayList<>();
    public List enterTerminal() {
        listTerminal.add("A");
        listTerminal.add("B");
        listTerminal.add("C");
        listTerminal.add("D");
        int random = (int) (Math.random() * listTerminal.size());
        Integer randomEnterTerminal = (int) (Math.random() * (20 - 1) + 1);
        System.out.println("Выход: " + randomEnterTerminal + listTerminal.get(random));
        return listTerminal;
    }
}
