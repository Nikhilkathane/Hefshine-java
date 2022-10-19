package core_java;

public class numpatt6 {
    public static void main(String args[])
    {
        int cnt=1;
        for(int i=0;i<5;i++)
        {
            int diff=4;
            int count=cnt;

            for(int j=0;j<9;j++)
            {

                if(j-i<=0)
                {
                    System.out.print(count+" ");
                }
                else
                {
                    System.out.print(" ");
                }
                count=count+diff;
                diff--;

            }
            cnt++;
            System.out.println();
        }

    }
}

