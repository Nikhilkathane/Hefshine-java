package core_java;

public class Alphapatt8 {
    public static void main(String args[])
    {
        int cnt=0;
        for(int i=0;i<5;i++)
        {
            int diff=5;
            int count=cnt;

            for(int j=0;j<9;j++)
            {

                if(j-i<=0)
                {
                    System.out.print((char)(count +65)+" ");
                }
                else
                {
                    System.out.print(" ");
                }
                count=count+diff;

            }
            cnt++;
            System.out.println();
        }

    }
}

