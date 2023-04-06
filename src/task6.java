import java.util.Scanner;

public class task6 {
    public static int findPower(int n, int m) {
        if(m==0) return 1; // base case
        return n * findPower(n, m-1); // returning the power of n by multiplying each value
    }

    public static void main(String[] args) {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        int n = sc.nextInt(); // @ n = entered value
        System.out.println("Please, enter power of your number: ");
        int m = sc.nextInt(); // @ m = power of n
        int res = findPower(n, m); // getting our function
        System.out.println(m + " to the power of " + n + " is: "+ res);

        sc.close();

    }
}
