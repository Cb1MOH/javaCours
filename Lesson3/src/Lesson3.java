import java.util.Random;

public class Lesson3 {
    public static void main(String[] args) {

        Random rand = new Random();

        int[][] marks = new int[4][];

        for (int i = 0; i < marks.length; i++) {
            marks[i] = new int[rand.nextInt(3) + 2];
        }
            for (int i = 0; i < marks.length; i++) {
                for (int j = 0; j < marks[i].length; j++) {
                    System.out.println(marks[i][j] + "            ");
                }
            }

        }
    }
}

