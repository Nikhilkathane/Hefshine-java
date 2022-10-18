package core_java;

public class numpatt3 {
    public static void main(String args[])
    {
        for (int i=0;i<9;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(j-i>=0 && i<=4)
                    System.out.print(j-i+1);
                else if(i>4 && j+i>=8)
                    System.out.print(j+i-6);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
