import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Osoba o1 = new Osoba("Georg", "Soros", 80928);
        Student s1 = new Student(o1, WydzialEnum.wydzial.PRAWA);
        Osoba o2 = new Osoba("Pawel", "Mikolajuw", 98261);
        Student s2 = new Student(o2, WydzialEnum.wydzial.FILOZOFII);
        Osoba o3 = new Osoba("Jaroslaw", "Kaczynski", 31233);
        Student s3 = new Student(o3, WydzialEnum.wydzial.PRAWA);
        Osoba o4 = new Osoba("Donald", "Tusk", 54312);
        Student s4 = new Student(o4, WydzialEnum.wydzial.INFORMATYCZNY);
        Osoba o5 = new Osoba("Edyta", "Gorniak", 86423);
        Student s5 = new Student(o5, WydzialEnum.wydzial.HISTORII);
        List<Student> studenci = new ArrayList<>();
        studenci.add(s1);
        studenci.add(s2);
        studenci.add(s3);
        studenci.add(s4);
        studenci.add(s5);
        for (Student stud : studenci){
            System.out.print(stud.toString());
        }

    }
}
