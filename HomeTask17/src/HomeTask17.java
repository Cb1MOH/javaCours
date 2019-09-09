public class HomeTask17 {
    public static void main(String[] args) {
        int butterflyArray[][] = new int[5][5];
        for (int i = 0; i < butterflyArray.length; i++) {
            for (int j = 0; j < (butterflyArray[i].length /2) +1; j++) {

                butterflyArray[i][j] = 1;

            }


        }







// Print the butterfly
        for (int i = 0; i < butterflyArray.length; i++) {
            System.out.println("   ");
            for (int j = 0; j < butterflyArray[i].length; j++) {
                System.out.print(butterflyArray[i][j] + "   ");

            }
        }
    }
}

