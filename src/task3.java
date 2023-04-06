import java.util.Scanner;

public class task3 {
    public static String findPrime(int n) {
        for(int i = 2; i<n/2; i++) { // checking for prime by dividing numbers two times lesser than n
            if(n%i == 0) return "Composite"; // if n is divisible by any number in this loop
        }
        return "Prime"; // else returning "Prime"
    }
    public static void main(String[] args) {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the number that you want to check: ");
        int n = sc.nextInt(); // @ n = input number
        System.out.println("This number is " + findPrime(n));

        sc.close();


    }
}