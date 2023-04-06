import java.util.Scanner;

public class task4 {
    public static int findFactorial(int n) {
        if(n==1) return 1;
        return findFactorial(n-1) * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        int n = sc.nextInt();
        int res = findFactorial(n);
        System.out.println("Factorial of your number is: " + res);

        sc.close();

    }
}
