package core_java;

public class numpatt4 {
    public static void main(String args[])
    {
        int counter=1;
        for (int i=0;i<9;i++)
        {
            for (int j=0;j<5;j++)
            {
                if (j - i >= 0 || j + i >= 8)
                    System.out.print(counter++);
                else
                    System.out.print(" ");
            }

            System.out.println();
            }
        }
    }

