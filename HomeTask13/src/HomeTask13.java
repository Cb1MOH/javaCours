//Задание 13
//        Создать последовательность случайных чисел, найти и вывести наибольшее
//        из них.

import java.util.Arrays;

public class HomeTask13 {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            int randomInt = (int)(Math.random() * 100);
            array[i] = randomInt;
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        System.out.println("Last number in array is " + array[array.length -1]);
    }
}
