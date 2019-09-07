//Задание 11
//        Имеется целое число, определить является ли это число простым, т.е.
//        делится без остатка только на 1 и себя.

import java.util.Random;

public class HomeTask11 {
    public static void main(String[] args) {
        int rand = (int)(Math.random() * 100);  // Please set diapason to generate random int. Now it set to 1-100.
        System.out.println(rand);
        if (rand % rand == 0){
            if (rand % 2 == 0){
                System.out.println("У тебя не простое число");
            }else {
                System.out.println("У тебя простое число!!!");
            }


        } else {
            System.out.println("У тебя не простое число");
        }
    }
}
