import java.util.Scanner;

public class task10 {
    public static int findGcd(int a, int b) {
        if(b==0) return a; // base case
        return findGcd(b, a%b); // returning the greatest common divisor by taking mod of two elements

    }

    public static void main(String[] args) {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the first number: ");
        int a = sc.nextInt(); // @ a = first entered value
        System.out.println("Please, enter the second number: ");
        int b = sc.nextInt(); // @ b = second entered value
        int res = findGcd(a, b); // getting our function
        System.out.println("The GCD of numbers " + a + " and " + b + " is: " + res);

        sc.close();

    }
}
