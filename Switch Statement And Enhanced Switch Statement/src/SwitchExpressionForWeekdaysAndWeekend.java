import java.util.Scanner;

public class SwitchExpressionForWeekdaysAndWeekend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day between (1 to 7)");
        int day = input.nextInt();

        String result = switch (day){
            case 1,2,3,4,5 -> "Weekday";
            case  6,7 -> "Weekend";
            default -> "Unexpected value: "+day;
        };
        System.out.println("Result is: "+result);
    }
}
