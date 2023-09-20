import java.util.Scanner;

public class CalculatorBySwitchExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        System.out.println("Choose an operator: +,_,*, or /: ");
        char operator = input.next().charAt(0);

        int result = switch (operator){
            case '+'->number1 + number2;
            case '-'->number1 - number2;
            case '*'->number1 * number2;
            case '/'->number1 / number2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };

        System.out.println("Result: "+result);

    }
}
