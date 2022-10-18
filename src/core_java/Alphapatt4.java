package core_java;

public class Alphapatt4 {
    public static void main(String args[])
    {
        int cnt=0;
        for (int i=0;i<6;i++) {
            int count = cnt;
            for (int j = 0; j < 6; j++) {
                if (j - i <= 0)
                    System.out.print((char)(count-- +65));
                else
                    System.out.print(" ");
            }
            cnt++;
            System.out.println();
        }
        }
    }

