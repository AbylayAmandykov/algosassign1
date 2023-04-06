import java.util.Scanner;
public class task2 {
    public static double findAvg(int n, int[] arr) {
        double sum = 0; // @ sum = sum of all elements
        for(int i = 0; i<n; i++) {
            sum += arr[i]; // adding all elements to get result
        }
        return sum/n; // returning the average number dy dividing to length
    }
    public static void main(String[] args) {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write the length of your array: ");
        int n = sc.nextInt(); // @ n = length of the array
        System.out.println("Please, input the numbers of your array:");
        int[] arr = new int[n]; // @ arr = array
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The average number of your array is: " + findAvg(n ,arr));

        sc.close();

    }
}

