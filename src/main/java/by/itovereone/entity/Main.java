package by.itovereone.entity;

import java.util.List;
import java.util.Scanner;

import static by.itovereone.service.ServiceHuman.*;
import static by.itovereone.service.ServiceStudent.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// запустили сканнер общий для всех

        List<Student> students = getStudents(sc);
        List<Student> goodStudents = ListStudentAvg(students);
        printStudent(students);
        System.out.println("");
        printStudentsShort(goodStudents);

        List<Human> humans = getHumans(sc);
        printHuman(humans);
        List<Human> newList = humanStartstWith(humans);
        System.out.println("Список Human имен с первой букуой В");
        printHuman(newList);

    }


}


