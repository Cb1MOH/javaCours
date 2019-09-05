import java.util.Random;

public class HomeTask8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt();
        int lastDigit = Math.abs(randomNumber) % 10;
        String message = "You've entered the number of ";
        String rubbles = " рублей";
        String rubble = " рубль";
        String rubble2 = " рубля";

        switch (lastDigit) {
            case 0:
                System.out.println(message + randomNumber + rubbles);
                break;

            case 1:
                System.out.println(message + randomNumber + rubble);
                break;

            case 2:
                System.out.println(message + randomNumber + rubble2);
                break;

            case 3:
                System.out.println(message + randomNumber + rubble2);
                break;

            case 4:
                System.out.println(message + randomNumber + rubble2);
                break;

            case 5:
                System.out.println(message + randomNumber + rubbles);
                break;

            case 6:
                System.out.println(message + randomNumber + rubbles);
                break;

            case 7:
                System.out.println(message + randomNumber + rubbles);
                break;

            case 8:
                System.out.println(message + randomNumber + rubbles);
                break;

            case 9:
                System.out.println(message + randomNumber + rubbles);
                break;


        }
    }
}
