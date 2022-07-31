import java.util.ArrayList;
import java.util.List;

public class Terminal {
    List<String> listTerminal = new ArrayList<>();
    private int cash = 0;
    private String firstName;
    private String middleName;
    private String fathersName;
    private final Integer MAX_BAGGAGE = 30; //кг
    private final Integer PAY_BAGGAGE = 150; //рублей

    public Terminal(String firstName, String middleName, String fathersName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.fathersName = fathersName;
    }

    public List<String> terminal() {
        listTerminal.add("A");
        listTerminal.add("B");
        listTerminal.add("C");
        listTerminal.add("D");
        int random = (int) (Math.random() * listTerminal.size());
        System.out.println("Терминал: " + listTerminal.get(random));
        return listTerminal;
    }
    
    public Integer priceBaggageTransportation(int bag) {
        int cash = 0;
        if (bag <= MAX_BAGGAGE) {
            System.out.println("Вес вашего багажа состовляет: " + bag);
        } else {
            int wight = bag - MAX_BAGGAGE;
            cash = PAY_BAGGAGE * wight;
            System.out.println("Вес вашего багажа состовляет: " + bag);
            System.out.println("Стоимость перевоза вашего багажа составит: " + cash + " рублей");
        }
        return this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + System.lineSeparator() +
                "Фамилия: " + middleName + System.lineSeparator() +
                "Отчество: " + fathersName;
    }

}
