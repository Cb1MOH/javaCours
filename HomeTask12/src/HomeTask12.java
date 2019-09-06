//Задание 12
//        Найдите сумму первых n целых чисел, которые делятся на 3.


import java.util.Random;

public class HomeTask12 {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = Math.abs(rand.nextInt(101)); //Use bound to set maximum range of generated int
        long sum = 0;
        System.out.println(n);

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0){
                sum += i;
                System.out.println(sum);
            }


        }
    }
}
