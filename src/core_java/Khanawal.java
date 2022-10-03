package core_java;

import java.util.Scanner;

public class Khanawal {
    public static void main(String args[])
    {
        System.out.println("enter the amount");
        Scanner sc=new Scanner(System.in);
                int amount= sc.nextInt();

        if (amount>=500)
        {
            System.out.println("Tajhotel");
        }
        else if (amount>=300)
        {
            System.out.println("3 star ");
        }
        else if (amount>=150)
        {
            System.out.println("Aapli mess");
        }
        else
        {
            System.out.println("Wadapaw");
        }
    }
}
