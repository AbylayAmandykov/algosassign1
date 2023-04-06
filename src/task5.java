import java.util.Scanner;

public class task5 {
    public static int findFib(int n) {
        if(n==0) return 0;
        if(n==1) return 1; // base cases
        return findFib(n-1)+findFib(n-2); // returning the fibonacci of number by this formula
    }

    public static void main(String[] args) {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        int n = sc.nextInt(); // @ n = input value
        int res = findFib(n); // getting our function
        System.out.println("The fibonacci of your number is: " + res);

        sc.close();

    }
}
