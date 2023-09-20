import java.util.Scanner;

public class AverageMinAndMaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int sizeOfArray = input.nextInt();

        int[] numbers = new  int[sizeOfArray];
        for (int i= 0; i<numbers.length; i++){
            System.out.println(i+": ");
            numbers[i] = input.nextInt();
        }
        int sum = 0;
        for(int i = 0; i <numbers.length; i++){
            sum +=numbers[i];
        }
        double average = (double) sum/numbers.length;

        int min = numbers[0];
        int max = numbers[0];

        for(int i = 1; i <numbers.length; i++){
            if (min>numbers[i]){
                min = numbers[i];
            }
            if (max<numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("sum = "+sum);
        System.out.println("Average = "+average);
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
    }
}
