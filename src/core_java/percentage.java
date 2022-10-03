package core_java;
import java.util.Scanner;

public class percentage {
    public static void main(String args[]) {
        Scanner ob= new Scanner(System.in);
        System.out.println("enter the Five subject marks");
        int sub1 = ob.nextInt();
        int sub2 = ob.nextInt();
        int sub3 = ob.nextInt();
        int sub4 = ob.nextInt();
        int sub5 = ob.nextInt();

        int totalmarks=sub1+sub2+sub3+sub4+sub5;
        double percentage=(totalmarks*100)/500;
        double avg =(totalmarks/5);
        System.out.println(percentage);
        System.out.println(avg);
        System.out.println(totalmarks);

    }
}
