package core_java;

public class Andop {
    public static void main(String args[]) {
        char ch = '&';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("small");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital");
        } else {
            System.out.println("Something else");
        }
    }
}
