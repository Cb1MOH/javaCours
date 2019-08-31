//Создайте число. Определите, является ли число трехзначным.

public class HomeTask6_1 {
    public static void main(String[] args) {

        int num = 227;
        int i = 0;

//        Verification if number has 3 digits
        while (num != 0) {
            int digitsNum = num;
            digitsNum /= 10;
            ++i;
        }

        if (i == 3) {
            System.out.println("The number has 3 digits");
        } else {
            System.out.println("The number has more or less than 3 digits");
        }
    }
}
