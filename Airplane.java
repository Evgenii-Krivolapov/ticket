import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Airplane {
    private List<String> listGate = new ArrayList<>();
    private String onCity;
    private String toCity;

    public Airplane(String onCity, String toCity) {
        this.onCity = onCity;
        this.toCity = toCity;
    }

    public void gate() {
        listGate.add("A");
        listGate.add("B");
        listGate.add("C");
        listGate.add("D");
        listGate.add("E");
        listGate.add("F");
        int randomGate = (int) (Math.random() * listGate.size());
        int random = (int) (Math.random() * (267 - 1) + 1);
        System.out.println("GATE: " + random + listGate.get(randomGate));

        Calendar calendar = new GregorianCalendar();
        System.out.println("����� �� ���: " + calendar.getTime());

        int randomHour = (int) (Math.random() * 24);
        int randomTime = (int) (Math.random() * 24);
        System.out.println("����� �����������: " + randomHour + ":" + randomTime);
    }

    public List airplane() {

        List<String> listAirplan = new ArrayList<>();
        listAirplan.add("������� ��-134");
        listAirplan.add("������� ��-154 ");
        listAirplan.add("������� ��-62");
        listAirplan.add("������� ��-96");
        listAirplan.add("��-96-300");
        listAirplan.add("��-96�");
        listAirplan.add("Airbus A310");
        listAirplan.add("Airbus A320");
        listAirplan.add("Airbus A330");
        listAirplan.add("Boeing-737");
        listAirplan.add("Boeing-747");

        int random1 = (int) (Math.random() * listAirplan.size());
        System.out.println("������: " + listAirplan.get(random1));
        return listAirplan;
    }
    public List getList (){
        return listGate;
    }
    @Override
    public String toString() {
        return "����: " + onCity + "-" + toCity;
    }
}
