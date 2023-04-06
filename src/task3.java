import java.util.Scanner;

public class task3 {
    public static String findPrime(int n) {
        for(int i = 2; i<n/2; i++) {
            if(n%i == 0) return "Composite";
        }
        return "Prime";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input the number that you want to check: ");
        int n = sc.nextInt();
        System.out.println("This number is " + findPrime(n));

        sc.close();


    }
}