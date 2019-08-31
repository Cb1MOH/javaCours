//Создайте число. Определите, является ли число четным.

public class HomeTask6_3 {
    public static void main(String[] args) {

        int num = 227;
        int i = 0;

//        Verification if number is even
        switch (num % 2) {
            case 0:
                System.out.println("The number is even");
                break;
            default:
                System.out.println("The number is odd");
        }
    }
}
