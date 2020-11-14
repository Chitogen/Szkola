package pl.mainkomputer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Marcin - Podaj nazwe szkoły:");
        String nazwaSzkoły1 = scanner.nextLine();
        System.out.print("Zbyszek - Podaj nazwe szkoły:");
        String nazwaSzkoły2 = scanner.nextLine();
        System.out.print("Mariusz - Podaj nazwe szkoły:");
        String nazwaSzkoły3 = scanner.nextLine();

        System.out.println("");
        Student student1 = new Student("imię:Marcin ",nazwaSzkoły1);
        System.out.println(student1.imie + "szkoła:"+ student1.nazwaSzkoły);
        System.out.println("");

        Student student2 = new Student("imię:Zbyszek ",nazwaSzkoły2);
        System.out.println(student2.imie + "szkoła:"+ student2.nazwaSzkoły);
        System.out.println("");

        Student student3 = new Student("imię:Mariusz ",nazwaSzkoły3);
        System.out.println(student3.imie + "szkoła:"+ student3.nazwaSzkoły);
        System.out.println("");
    }
}
