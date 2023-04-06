import java.util.Scanner;
public class task2 {
    public static double findAvg(int n, int[] arr) {
        double sum = 0;
        for(int i = 0; i<n; i++) {
            sum += arr[i];
        }
        return sum/n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write the length of your array: ");
        int n = sc.nextInt();
        System.out.println("Please, input the numbers of your array:");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The average number of your array is: " + findAvg(n ,arr));

        sc.close();

    }
}

