public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] myNumbers = new int[5][3];

        for (int row = 0; row < myNumbers.length; row++) {
            for(int column = 0; column < myNumbers[row].length; column++) {
                myNumbers[row][column] = row*column;

            }
        }

    //print array
        for (int row = 0; row < myNumbers.length; row++) {
            for(int column = 0; column < myNumbers[row].length; column++) {
                System.out.print(myNumbers[row][column]+" ");
            }
            System.out.println();
        }
    }
}

