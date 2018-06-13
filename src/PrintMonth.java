import java.util.Scanner;

public class PrintMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numDays = 0;

        System.out.printf("Enter number of days in the month: ");
        numDays = sc.nextInt();

        System.out.println(printMonthNames(numDays));
    }

    public static String printMonthNames(int numDays) {
        String months = "";

        switch (numDays) {
            case 30:
                months = "September, April, June, November";
                break;
            case 31:
                months = "January, March, May, July, August, October, December";
                break;
            case 28:
                months = "February";
                break;
            case 29:
                months = "February";
                break;
            default:
                months = "There are no months with this number of days.";
                break;
        }

        return months;
    }
}
