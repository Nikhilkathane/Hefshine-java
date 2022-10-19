package core_java;

public class numpatt8 {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            int cnt = 1;
            for (int j = 0; j < 9; j++) {

                if (j - i <= 4 && j + i >= 4) {
                    if (j < 4) {
                        System.out.print(cnt++);
                    } else {
                        System.out.print(cnt--);

                    }
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println();
        }

    }
}


