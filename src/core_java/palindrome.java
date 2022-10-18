package core_java;

public class palindrome {
    public static void main(String args[]) {

        int num = 121;
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        System.out.println(sum);
        if (temp == sum) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not palindrome number");
        }
    }
}
