//Задание 10
//        Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

import java.util.Random;

public class HomeTask10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(5) + 10;
        long factorial = 1;
        for (int i = 2; i <=randomNumber ; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
}
