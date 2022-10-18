package core_java;

import java.util.Scanner;

public class Calculater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n1 = sc.nextInt();
        System.out.println("enter the  second number");
        int n2 = sc.nextInt();
        System.out.println("enter the choice : 1-add,2-sub,3-mul,4-div");
        int ch = sc.nextInt();
        if (ch == 1) {
            System.out.println("Addition is:" + (n1 + n2));
        } else if (ch == 2) {
            System.out.println("subtraction is :" + (n1 - n2));
        } else if (ch == 3) {
            System.out.println("Multiplication is :" + (n1 * n2));
        } else if (ch == 4) {
            System.out.println("Division is :"+(n1 / n2));
        } else {
            System.out.println("Invalid Input");
        }

    }
}