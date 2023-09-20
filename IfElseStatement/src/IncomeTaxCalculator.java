import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {

        System.out.println("Enter your yearly income: ");
        Scanner input = new Scanner(System.in);
        double income = input.nextDouble();

        double taxableIncome = income-300_000; //No Tax till 300_000

        double tax;

        if(taxableIncome <= 100_000){
            tax = taxableIncome * .05;
        } else if (taxableIncome <=(100_000 + 300_000)) {
            tax = (100_000 * .05
                    + (taxableIncome-100_000)* .10);
        } else if (taxableIncome <= (100_000 + 300_000 + 400_000)) {
            tax = (100_000 * .05
                    +300_000 * .10
                    + (taxableIncome-(100_000 + 300_000))* .15);

        } else if (taxableIncome <= (100_000 + 300_000 + 400_000 + 500_000)) {
            tax = (100_000 * .05
                    + 300_000 * .10
                    + 400_000 * .15
                    + (taxableIncome - (100_000 + 300_000 + 400_000)) * .20);

        }else{
            tax = (100_000 * .05
                    + 300_000 * .10
                    + 400_000 * .15
                    + 500_000 * .20
                    + (taxableIncome - (100_000 + 300_000 + 400_000 +500_000)) * .25);
        }

        System.out.println("Your tax is: "+tax);
    }
}
