package core_java;

import java.util.Scanner;

public class Ifc {
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the count");
        int Dailytask=sc.nextInt();
        if (Dailytask>=15)
        {
            System.out.println("enjoy Your day");
        }
        else
        {
            System.out.println("your Blocked");

        }
    }
}
