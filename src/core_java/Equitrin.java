package core_java;

public class Equitrin {
    public static void main(String args[]) {
        int s1 = 5;
        int s2 = 5;
        int s3 = 5;
        if (s1==s2 && s2==s3 && s3==s1)
        {
            System.out.println("equi");
        } else if (s1==s2 || s2==s3 || s3==s1)
        {
            System.out.println("isometric");
        }
        else {
            System.out.println("Something else");
        }
    }

    }
