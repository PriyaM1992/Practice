import java.util.Scanner;

public class Maximum_3_Number {

    public static void main (String[] args) {

        int a;
        float b;
        double c;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a:");
        a = scan.nextInt();

        System.out.println("Enter b:");
        b = scan.nextFloat();

        System.out.println("Enter c:");
        c = scan.nextDouble();

        if (a > b && a > c) {
            System.out.println("a is bigger");
        } else if (b >= a && b >= c) {
            System.out.println("b is bigger");
        } else if (c >= a && c>= b){
            System.out.println("c is bigger");
        }
        else
        {
            System.out.println("all are equal");
        }
    }

    }

