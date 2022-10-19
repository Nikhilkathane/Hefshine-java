package core_java;

public class Alphapatt7 {
    public static void main(String args[])
    {
        for (int i = 0; i < 9; i = i + 2)
        {
            int cnt = 0;
            for (int j = 0; j < 9; j++)
            {

                if (j - i <= 0)
                {
                    if (j < i / 2)

                        System.out.print((char)(cnt++ +65));

                    else

                        System.out.print((char)(cnt-- +65));
                }
                else
                {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }
    }
}

