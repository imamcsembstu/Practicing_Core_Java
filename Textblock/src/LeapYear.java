import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=input.nextInt();
        boolean isDivisionBy4=year % 4==0;
        boolean isDivisionBy100=year % 100 ==0;
        boolean isDivision400=year % 400==0;
        boolean isLeapYear = (isDivisionBy4 && !isDivisionBy100) || isDivision400;
        if (isLeapYear){
            System.out.println(year+" is a leap year.");
        }else {
            System.out.println(year+" is a not leap year.");
        }
    }
}
