//Задание 9
//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.

public class HomeTask9 {
    public static void main(String[] args) {
        double averageSum = 0;
        double factorial = 1;
        int n = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            factorial *= x;
            n++;
            x = (int) (Math.random() * 20);
        }


        if (n != 0) {
            averageSum = factorial / n;
        } else {
            averageSum = 0;
        }
        System.out.println("Average of factorial:" + averageSum);
    }
}
