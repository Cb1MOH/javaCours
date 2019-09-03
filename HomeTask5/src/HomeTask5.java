//Задание 5
//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//различны?


public class HomeTask5 {
    public static void main(String[] args) {

        int theNumber = 1245;
        int digit4 = theNumber % 10;
        theNumber /= 10;
        int digit3 = theNumber % 10;
        theNumber /= 10;
        int digit2 = theNumber % 10;
        theNumber /= 10;
        int digit1 = theNumber % 10;


        System.out.println(digit4);
        System.out.println(digit3);
        System.out.println(digit2);
        System.out.println(digit1);


        boolean digit1HasDuplicates = (digit1 == digit2) || (digit1 == digit3) || (digit1 == digit4);
        boolean digit2HasDuplicates = (digit2 == digit1) || (digit2 == digit3) || (digit2 == digit4);
        boolean digit3HasDuplicates = (digit3 == digit1) || (digit3 == digit2) || (digit3 == digit4);
        boolean digit4HasDuplicates = (digit4 == digit1) || (digit4 == digit2) || (digit4 == digit3);

        System.out.println(digit1HasDuplicates);
        System.out.println(digit2HasDuplicates);
        System.out.println(digit3HasDuplicates);
        System.out.println(digit4HasDuplicates);

        if (digit1HasDuplicates == digit2HasDuplicates & digit1HasDuplicates == digit3HasDuplicates & digit1HasDuplicates == digit4HasDuplicates) {
            System.out.println("Your number has duplicate digits");
        } else {
            System.out.printf("There are no duplicate digits in your number");
        }


    }


}

