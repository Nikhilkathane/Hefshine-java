package core_java;

import java.awt.*;

public class kaprekar {
    public static void main(String args[])
    {
        int num=13;
        int temp=num;
        int square =num*num;
        int count=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        int div=(int)Math.pow(10,count);
        int x= square%div;
        int y= square/div;
        int sum=x+y;
        if (temp==sum)
        {
            System.out.println("Kaprekr number is : "+temp);
        }
        else
        {
            System.out.println("Not a kaprekar number : "+temp);
        }
    }
}
