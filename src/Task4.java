public class Task4 {
    public static void main(String[] args) {
        int number = 1234;
        int revertedNumber = 0;
        while (number != 0) {
            revertedNumber = revertedNumber * 10 + number % 10;
            number = number / 10;
        }

        System.out.println(revertedNumber);
    }
}
