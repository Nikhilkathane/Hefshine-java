package core_java;

public class PellSeries {
    public static void main(String args[])
    {
        int ft=0;
        int st=1;
        int nt=0;
        System.out.print(ft+ " "+st);
        for(int i=1;i<=15;i++)
        {
            nt=ft+(st*2);
            System.out.print(" "+nt);
            ft=st;
            st=nt;
        }
    }
}
//pell number its nt=ft+(st*2); multiplication the previous digit and add prev first number