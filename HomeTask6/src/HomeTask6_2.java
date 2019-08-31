//Создайте число. Определите, является ли его последняя цифра семеркой.
public class HomeTask6_2 {
    public static void main(String[] args) {

        int num = 227;
        int i = 0;

//        Verification if the last digit is equal to 7
        int ifTheNumIs7 = num % 10;
        if (ifTheNumIs7 == 7) {
            System.out.println("The last digit of the number is 7");
        } else {
            System.out.println("The last digit of the number is NOT 7");
        }
    }
}
