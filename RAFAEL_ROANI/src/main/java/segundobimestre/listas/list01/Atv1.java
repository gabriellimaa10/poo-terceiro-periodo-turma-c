package segundobimestre.listas.list01;

import java.util.ArrayList;
import java.util.List;

public class Atv1 {
    public static void main(String[] args) {
        List<String> colegas = new ArrayList<>();

        colegas.add("Guilherme");
        colegas.add("Anderson");
        colegas.add("Kaue");
        colegas.add("Lucas");
        colegas.add("Bernardo");

        colegas.forEach(colega -> System.out.println("R - " + colega));
    }
}
