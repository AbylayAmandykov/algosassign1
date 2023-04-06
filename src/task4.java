import java.util.Scanner;

public class task4 {
    public static int findFactorial(int n) {
        if(n==1) return 1; // base case
        return findFactorial(n-1) * n; // returning factorized number by multiplying previous numbers
    }

    public static void main(String[] args) {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        int n = sc.nextInt(); // @ n = input value
        int res = findFactorial(n); // getting our function
        System.out.println("Factorial of your number is: " + res);

        sc.close();

    }
}
