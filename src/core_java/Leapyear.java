package core_java;

public class Leapyear {
    public static void main(String args[])
    {
        int year=2022;
        if(year%100==0) {
            if (year % 400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("not leap year");

            }
        }
            if(year%4==0)
            {
                System.out.println("Leap year");

            }
            else
            {
                System.out.println("not leap year");
            }

        }
    }

