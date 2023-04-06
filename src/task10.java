import java.util.Scanner;

public class task10 {
    public static int findGcd(int a, int b) {
        if(b==0) return a;
        return findGcd(b, a%b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Please, enter the second number: ");
        int b = sc.nextInt();
        int res = findGcd(a, b);
        System.out.println("The GCD of numbers " + a + " and " + b + " is: " + res);

        sc.close();

    }
}
