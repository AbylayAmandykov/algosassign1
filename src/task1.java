import java.util.Scanner;
public class task1 {
    public static int findMin(int n, int[] arr) {
        int min = 10000000; // @ min = our first minimum value
        for(int i = 0; i<n; i++) {
            if(min > arr[i]) min = arr[i]; // finding the minimum by comparing each value
        }
        return min; // returning the minimum value
    }
    public static void main(String[] args) {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, write the length of your array: ");
        int n = sc.nextInt(); // @ n length of array
        System.out.println("Please, input the numbers of your array:");
        int[] arr = new int[n]; // @ arr = array
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The minimum number in your array is: " + findMin(n ,arr));

        sc.close();

    }
}




