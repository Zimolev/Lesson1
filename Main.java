package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

/* первое задание */

        Entyty[] entyties = new Entyty[3];

        entyties[0] = new Human("Ron", 100, 1);
        entyties[1] = new Robot("Verder", 1000, 10);
        entyties[2] = new Cat("Murka", 10, 3);

//      for (int i=0; i < entyties.length; i++) {
//          entyties[i].jump();
//          entyties[i].run();
//      }
/* второе задание*/

//        Random r = new Random();
//        int heigth = r.nextInt(10);
//
//        Wall wall = new Wall(heigth);
//        for (int i=0; i < entyties.length; i++) {
//            if (wall.getHeigth() > entyties[i].JumpingHeight()){
//                System.out.println(entyties[i].names() + " не смог перепрыгнуть " + heigth);
//            }
//            else System.out.println(entyties[i].names() + " смог перепрыгнуть " + heigth);
//        }
//
//        Random t = new Random();
//        int run = t.nextInt(1000);
//
//        Treadmill treadmill = new Treadmill(run);
//        for (int i=0; i < entyties.length; i++) {
//            if (treadmill.getRun() > entyties[i].RunningDistance()){
//                System.out.println(entyties[i].names() + " не смог пробежать " + run);
//            }
//            else System.out.println(entyties[i].names() + " смог пробежать " + run);
//        }

        /*третье и четвертое*/

       Barier[] bariers = new Barier[4];
       bariers[0] = new Wall(3);
       bariers[1] = new Treadmill(100);
       bariers[2] = new Wall(1);
       bariers[3] = new Treadmill(9);

//       bariers[2].moving(entyties[1]);
//       bariers[1].moving(entyties[2]);
//       bariers[0].moving(entyties[0]);

        for (int i = 0; i < entyties.length; i++) {
            boolean result = true;
            for (int j = 0; j < bariers.length; j++){
                result = bariers[j].moving(entyties[i]);
                if (!result) {
                    break;
                }
            }
            if (result) {
                System.out.println("Прошел препядствие");
            } else {
                System.out.println("Не прошел препядствие");
            }
        }


    }
}

