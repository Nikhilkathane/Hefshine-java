package core_java;

public class sumseriesfor {
    public static void main(String args[]) {
        int a = 0, b = 1, count = 10, c = 0;
        System.out.println(a + " " + b);
        for (int i = 2; i < count; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

    }
}