package core_java;

public class evenoddseries {
    public static void main(String args[])
    {
        int start=1,end=20;
        int i,j;
        System.out.println("Even number");
        for(i=start;i<end;i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        System.out.println("Odd number");
                for(j=start;j<end;j++)
                {
                    if(j%2!=0)
                        System.out.println(j);
        }
    }
}
