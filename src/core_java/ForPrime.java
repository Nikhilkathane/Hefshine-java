package core_java;

public class ForPrime {
    public static void main(String args[]) {
        int num = 15;
        int counter = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                counter++;
        }
            if (counter == 0) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }

