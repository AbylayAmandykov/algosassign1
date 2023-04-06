import java.util.Scanner;

public class task9 {
    public static int findCoefficient(int n, int k) {
        if(n==k) return 1;
        if(k==0) return 1; // base case
        return findCoefficient(n-1, k-1) + findCoefficient(n-1, k); // returning the coeff of two numbers by simple formula

    }

    public static void main(String[] args) {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first number: ");
        int n = sc.nextInt(); // @ n = first input number
        System.out.println("Please, enter the second number: ");
        int k = sc.nextInt(); // @ k = second input number
        int res = findCoefficient(n, k); // getting function
        System.out.println("Binomial coefficient of numbers " + n + " and " + k + " is: " + res);

        sc.close();


    }
}
