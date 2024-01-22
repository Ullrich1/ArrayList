import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    ArrayList<String> carros =  new ArrayList<String>();
        carros.add("Fusca");
        carros.add("tobaba");
        carros.add("cavalo");
        carros.add("hb20 sedan");

        carros.remove(1);
        carros.add("uno da escadinha");


        System.out.println(carros.get(3));
    }
}