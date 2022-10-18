package core_java;
//total number of addition is = to divisble the number
public class Harshadnum {
    public static void main(String args[])
    {
        int num=171;
        int sum=0;
        int temp=num;
        while(temp>0)
        {
            sum=sum+(temp%10);
            temp=temp/10;

        }
        if (num%sum==0)
        {
            System.out.println("Harshad number");
        }else
        {
            System.out.println("not harshad number");
        }
    }
}
