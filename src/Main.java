import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        Meble m1 = new Meble(112.0, 150.1, 199.99);
        System.out.println(m1.toString());
        System.out.println(m1.wyliczCene());

        Stol s1 = new Stol(90.5, 120.1, 399.99, "IKEA", 0.90, true);
        System.out.println(s1.toString());
        System.out.println(s1.wyliczCene());

        Krzeslo k1 = new Krzeslo(130.3, 60.5, 189.99, 150, 50.99, true);
        System.out.println(k1.toString());
        System.out.println(k1.wyliczCene());

        List<Meble> ListaMebli = new ArrayList<>();
        ListaMebli.add(m1);
        ListaMebli.add(s1);
        ListaMebli.add(k1);
        System.out.println(ListaMebli);

        List<Stol> ListaMebli2 = new ArrayList<>();
        ListaMebli2.add(s1);
        System.out.println(ListaMebli2);

        List<Krzeslo> ListaMebli3 = new ArrayList<>();
        ListaMebli3.add(k1);
        System.out.println(ListaMebli3);

    }
}
