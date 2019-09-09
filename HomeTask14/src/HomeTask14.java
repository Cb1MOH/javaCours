import java.util.Random;

public class HomeTask14 {
    public static void main(String[] args) {
        Random rand = new Random();
        int random = rand.nextInt(11);
        int minimum = 999;
        int maximum = 0;
        int array[] = new int[random];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(21);
            System.out.print(array[i] + "   ");
        }

// Find minimum mark and index
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println("Minimum mark = " + minimum);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minimum) {
                System.out.println("Index of min mark = " + i);
                break;
            }
        }

// Find maximum mark and index
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println("Maximum mark = " + maximum);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maximum) {
                System.out.println("Index of max mark = " + i);
                break;
            }
        }


    }
}
