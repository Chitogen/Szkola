package pl.mainkomputer;

import java.util.Scanner;

public class Student {
    String imie;
    static int index = 0;

    Student(String imie,String nazwaSzkoły){
        this.imie = imie;

        int id = ++index;
        System.out.println("id studenta to "+ id);
    }


}
