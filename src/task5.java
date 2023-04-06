import java.util.Scanner;

public class task5 {
    public static int findFib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return findFib(n-1)+findFib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        int n = sc.nextInt();
        int res = findFib(n);
        System.out.println("The fibonacci of your number is: " + res);

        sc.close();

    }
}
