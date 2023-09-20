import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        long n = input.nextLong();
        System.out.println("Prime factor of "+n+"are: ");

        for (long i=2; i<n/i; i++){
            while (n%i==0){
                System.out.println(i+" ");
                n = n/i;
            }
        }if (n>1) {
            System.out.println(n);
        }
        }
    }
