package core_java;

public class Alphapatt2 {
    public static void main(String args[])
    {
        int cnt=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++) {
                if (j - i <= 0)
                    System.out.print((char) (cnt + 65));
                else
                    System.out.print(" ");
            }
            cnt++;
            System.out.println();
        }
    }

}
