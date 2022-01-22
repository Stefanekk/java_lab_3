import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        Student[] obj = new Student[3];

        Student student1 = new Student("Student1", "Student1", 1, true);

        Student student2 = new Student("Student2", "Student2", 2, false);

        Student student3 = new Student("Student3", "Student3", 3, true);


        obj[0] = student1;
        obj[1] = student2;
        obj[2] = student3;

        for (Student object : obj){
            System.out.println("Pole1: " + object.pole1);
            System.out.println("Pole2: " + object.pole2);
            System.out.println("Pole int: " + object.poleInt);
            System.out.println("Pole Boolean: " + object.poleBol);
            System.out.println("\n");
        }

    }
}
