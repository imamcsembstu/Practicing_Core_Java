import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        int number = 15;
        Scanner input = new Scanner(System.in);

        int guess;
        do {
            System.out.println("Guess a number: ");
            guess = input.nextInt();
            if (guess==number){
                System.out.println("Congratulations! You guessed the number.");
            } else if (number>guess) {
                System.out.println("The number is greater than "+guess);

            }else {
                System.out.println("The number is less than " + guess);
            }

        }while (guess!=number);
    }
}
