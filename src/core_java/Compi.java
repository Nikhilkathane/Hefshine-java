package core_java;
import java.util.Scanner;

public class Compi {
    public static void main(String args[])
    {
        Scanner nk=new Scanner(System.in);
        System.out.println("enter the  n r");
        double n=nk.nextInt();
        double r=nk.nextInt();
        double p=3.14;
        double area=p*n*r;
        System.out.println(area);


        }
    }

