package core_java;

public class Alphapatt5 {
    public static void main(String args[])
    {
        int cnt=0;
        for (int i=0;i<9;i++)
        {
            for (int j=0;j<5;j++)
            {
                if(j-i<=0 && j+i<=8)
                    System.out.print((char)(cnt +65));
                else
                    System.out.print(" ");
            }
            if(i<4)
                cnt++;
                        else
                            cnt--;
                        System.out.println();

        }
    }
}
