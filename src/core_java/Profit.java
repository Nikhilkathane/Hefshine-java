package core_java;
public class Profit
{
    public static void main(String args[])
    {
        int s1 = 1200;
        int s2 = 1400;
        if (s1 < s2)
        {
            System.out.println("Profit"+(s1+s2));
        }
        else if (s1 > s2)
        {
            System.out.println("Loss"+(s1-s2));
        }
        else
        {
            System.out.println("NO Profit or Loss");
        }
    }
}