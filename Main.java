public class Main {
    public static Terminal terminal = new Terminal("�������", "����������", "����������");
    public static EnterTerminal enterTerminal = new EnterTerminal();
    public static Airplane airplane = new Airplane("������", "����");

    public static void main(String[] args) {
        System.out.println("�����");
        System.out.println(terminal.toString());
        System.out.println(airplane.toString());

        terminal.terminal();
        terminal.priceBaggageTransportation(36);
        enterTerminal.enterTerminal();
        airplane.airplane();
        airplane.gate();
    }
}
