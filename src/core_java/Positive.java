package core_java;

import java.util.Scanner;

public class Positive {
    public static void main(String args[]){
        System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num>0)
        {
            System.out.println("Positive");
        } else if (num<0)
        {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}
