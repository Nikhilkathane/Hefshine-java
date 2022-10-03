import java.util.Scanner;
public class Year {
    public static void main(String args[]) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        {
            int year = num / 365;
            int rem1 = num % 365;
            int month = rem1 / 30;
            int rem2 = rem1 % 30;
            int week = rem2 / 7;
            int day = rem2 % 7;
            System.out.println(year + " " + month + " " + week + " " + day);
        }
    }
}
