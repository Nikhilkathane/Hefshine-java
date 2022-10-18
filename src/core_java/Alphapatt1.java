package core_java;

public class Alphapatt1 {
    public static void main(String args[])
    {

        for(int i=0;i<5;i++)

        {
            int cnt=0;
            for (int j = 0; j < 5; j++) {
                if (j - i <= 0)
                    System.out.print((char)(cnt++ +65));
                else
                    System.out.print(" ");
            }
            System.out.println();

            }
        }
    }


