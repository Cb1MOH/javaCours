import java.util.Random;

public class HomeTask15 {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(11);
        int array[] = new int[random];

        //Generate random array and print it
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(21);
            System.out.print(array[i] + "    ");
        }
        System.out.println("");


        //Reverse the array and print it
        for (int i = 0; i < array.length / 2; i++) {
            int value = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = value;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "    ");
        }


    }


}

