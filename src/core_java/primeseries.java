package core_java;

public class primeseries {
    public static void main(String args[])
    {
        for(int j=1;j<100;j++)
        {
            int num=j;
            int counter=0;
            for(int i=2;i<num;i++)
            {
                if(num%i==0)
                    counter++;
            }
            if(counter==0)
            {
                System.out.println("prime number : "+j);
            }

        }
    }
}
