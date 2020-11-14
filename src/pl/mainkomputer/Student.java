package pl.mainkomputer;

import java.util.Scanner;

public class Student {
    String imie;
    String nazwaSzkoły;
    static int index = 0;

    Student(String imie,String nazwaSzkoły){
        this.imie = imie;
        this.nazwaSzkoły = nazwaSzkoły;
        int id = ++index;
        System.out.println("id studenta to "+ id);
    }


}
