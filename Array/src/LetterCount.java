import java.util.Arrays;
import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter characters:  ");

        String inputValue = input.nextLine();
        inputValue = inputValue.toLowerCase();
        char[] letters = inputValue.toCharArray();

        System.out.println("Character Array is: " + Arrays.toString(letters));  // toS

        int[] counts = new int[26];

        for (char letter : letters) {  ///////////Enhance or ForEach Loop.
            if (Character.isLetter(letter)) {
                int index = letter - 'a';
                counts[index]++;
            }
        }




        System.out.println("Letter counts: ");
        for(int i=0; i< counts.length; i++){
            if(counts[i] != 0){
                char letter = (char) (i+ 'a');
                System.out.println(letter + ": "+counts[i]);
            }
        }
    }
}
