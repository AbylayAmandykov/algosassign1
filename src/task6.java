import java.util.Scanner;

public class task6 {
    public static int findPower(int n, int m) {
        if(m==0) return 1;
        return n * findPower(n, m-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number: ");
        int n = sc.nextInt();
        System.out.println("Please, enter power of your number: ");
        int m = sc.nextInt();
        int res = findPower(n, m);
        System.out.println(m + " to the power of " + n + " is: "+ res);

        sc.close();

    }
}
