package by.itovereone.service;

import by.itovereone.entity.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ServiceHuman {
    public static List<Human> getHumans(Scanner sc) {
        System.out.println("Введите количество людей");
        int size = sc.nextInt();
        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println("Введите имя");
            String name = sc.next();

            Human newHumans = new Human(name);
            humans.add(newHumans);
        }
        Collections.sort(humans);
        return humans;
    }
    public static List<Human> humanStartstWith(List<Human> humans){
    return humans.stream()
    .filter(p->p.getName().startsWith("B"))
    .collect(Collectors.toList());
    }

 //   public static List<Human> humanStartstWith(List<Human> humans) {
  //      List<Human> newList = new ArrayList<>();
 //       for (int j = 0; j < humans.size(); j++) {
  //          if (humans.get(j).getName().startsWith("B")) {
 //               newList.add(humans.get(j));
 //           }
//        }
 //       return newList;
 //   }

   public static void printHuman(List<Human> humans) {
      for (int i = 0; i < humans.size(); i++) {
            //          for (int j=0;j<humans.size()-1;j++){
            //              if(humans.get(j).getName().compareTo(humans.get(j+1).getName())>0){
            //                  Human t= humans.get(j);
            //                  humans.add(j, humans.get(j+1));
            //                  humans.add(j+1, t);
//                }
            //          }
            //       }
         System.out.println(humans.get(i));
        }

    }
}

