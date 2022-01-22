import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
        //aa
        Punkt p1 = new Punkt(7);
        p1.toString();
        Punkt p2 = new Punkt(1, 2, 3);
        p2.toString();
        p1.setPx(6);
        p1.setPy(7);
        p1.setPz(7);
        p1.toString();
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(p1.getZ());
        System.out.println(p1.roznica());
        System.out.println(p1.roznica(2,5,3));



    }
}
