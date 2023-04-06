import java.util.Scanner;
public class task1 {
    public static int findMin(int n, int[] arr) {
        int min = 10000000;
        for(int i = 0; i<n; i++) {
            if(min > arr[i]) min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write the length of your array: ");
        int n = sc.nextInt();
        System.out.println("Please, input the numbers of your array:");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The minimum number in your array is: " + findMin(n ,arr));

        sc.close();

    }
}




